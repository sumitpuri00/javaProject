package nightController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class shitcontroller {
    @GetMapping("/byee")
    public String getindex(){
        return "index";
    }
    @PostMapping("/submitt")
    public String postMethod(@ModelAttribute modelClass sumitModel){
        System.out.println(sumitModel.toString());
        return "index";
    }

}
