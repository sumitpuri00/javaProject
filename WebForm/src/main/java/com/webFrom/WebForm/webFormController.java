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
                new employee("zoro","swordsman"),
                new employee("dragon","army"),
                new employee("sum ","backend"),
                new employee("dragon","army")


    );


    @GetMapping("/dynamic")
    public String postData(Model modelVariable){
        modelVariable.addAttribute("employeeList",this.employeesData);
        modelVariable.addAttribute("newEmployee",new employee(null,null));
//        System.out.println(employeesData.get(0).name);
        return "dynamicPage";
    }


    @PostMapping("/url")
    public String dynamicAddData(@ModelAttribute employee employeeVariable,Model modeladd){
//        this.employeesData.add(employeeVariable);
//        System.out.println(Arrays.asList(employeeVariable));
            modeladd.addAttribute("newData",employeeVariable);
//          return "redirect:/dynamic";
        return "data";

    }
    @GetMapping("/p")
    public String css(){
        return "cssform";
    }

    @GetMapping("/responsebody")
    @ResponseBody
    public String j(){
        return "this is a @ResponseBody annotation any templates to this method";
    }



    @GetMapping("/json")
    @ResponseBody
    public List<employee>employeeJson(){
        List<employee> employeesDataWithJson= Arrays.asList(
                new employee("sum ","backend"),
                new employee("vanya","frontend"),
                new employee("luffy","catpain"),
                new employee("zoro","swordsman"),
                new employee("dragon","army"),
                new employee("sum ","backend"),
                new employee("dragon","army")


        );
        return employeesDataWithJson;
    }
}
