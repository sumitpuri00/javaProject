package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/all")
public class Web_controller {

    @GetMapping("/sumit")
    public String index(){
        return "sumitpuri";
    }
    @GetMapping("/sumitpuri")
    public String s(){
        return "sumitpuri";
    }
}
