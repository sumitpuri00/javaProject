package restapi.start.controller_package;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import restapi.start.interface_package.Student_repository;
import restapi.start.service_package.PuriStudent;
import restapi.start.service_package.Student;

import java.util.List;

@Controller
@RequestMapping("/api")
public class HtmlController {
    @GetMapping("/s")
    public String index(){
        return "sumit";
    }
    @GetMapping("/p")
    public String s(){
        return "start";
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
