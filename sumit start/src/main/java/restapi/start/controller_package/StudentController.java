package restapi.start.controller_package;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import restapi.start.interface_package.Student_repository;
import restapi.start.service_package.Student;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    public Student_repository studentRepositoryVariable;
    @GetMapping("/detail")
    public List<Student> getDetail(){
        return studentRepositoryVariable.findAll();
    }


    @GetMapping("/start")
    public String index(){
        return "start is a string";

    }

    @Autowired
    public Student_repository stu;
    @GetMapping("/getStudent")
    public List<Student> allStudent(){


//        return stu.findAll();
        return studentRepositoryVariable.findAll();
    }

}

