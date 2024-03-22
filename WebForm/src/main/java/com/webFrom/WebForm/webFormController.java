package com.webFrom.WebForm;

import modelPackage.employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping

public class webFormController {
    @GetMapping("/a")
    public String getData(){
        return "data";
    }

    public List<employee> employeesData= Arrays.asList(
                new employee("sum ","backend"),
                new employee("vanya","frontend"),
                new employee("luffy","catpain"),
                new employee("zoro","swordsman")
    );


    @GetMapping("/dynamic")
    public String postData(Model modelVariable){
        modelVariable.addAttribute("employeeList",this.employeesData);
        modelVariable.addAttribute("newEmployee",new employee(null,null));
//        System.out.println(employeesData.get(0).name);
        return "dynamicPage";
    }


    @PostMapping("/newEmployeeUrl")
    public String dynamicAddData(@ModelAttribute employee employeeVariable){
//        this.employeesData.add(employeeVariable);
          this.employeesData.clear();
//        System.out.println(Arrays.asList(employeeVariable));
          return "redirect:/dynamic";

    }
}
