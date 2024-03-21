package restapi.start.controller_package;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import restapi.start.interface_package.Student_repository;
import restapi.start.service_package.FormDetail;
import restapi.start.service_package.PuriStudent;
import restapi.start.service_package.Student;

import java.util.List;

@Controller
@RequestMapping
public class HtmlController {
    @GetMapping("/v")
    public String v(){
        return "vanya";
    }

    @PostMapping("/submit")
    public String s(@ModelAttribute FormDetail formVariable,Model modelVariable){
        System.out.println(formVariable.toString());
//        we can also pass the formVariable to the addAttribute but
//        we have to get the data from the formVariable by thymlef;
        modelVariable.addAttribute("unamee",formVariable.getUmane());
        modelVariable.addAttribute("pwordd",formVariable.getPword());
        return "start";
    }


    @PutMapping("/s")
    public String index(){
        return "sumit";
    }

//    @Autowired
//    Student_repository stu;
//    List<Student>studentList=stu.findAll();
//   @GetMapping("/getStudent")
//    public String allStudent(Model modelVariable){
//
//        modelVariable.addAttribute("attributeName",studentList);
//        return "index";
//    }
//    @Autowired
//    public PuriStudent studentVariable;
//    @PutMapping("/put")
//    public String  put(){
//        studentVariable.setPuriId(putStudent.getPuriId());
//        studentVariable.setPuriName(putStudent.getPuriName());
//        return "index";
//    }
}
