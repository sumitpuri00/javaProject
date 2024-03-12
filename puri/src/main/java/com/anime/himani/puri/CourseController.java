package com.anime.himani.puri;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

//@RestController
public class CourseController {
//    @RequestMapping("/restapi")
    public List<Course> retriveAllCources(){
        return Arrays.asList(
                new Course(1,"sumit","puri"),
                new Course(2,"him","goswami"),
                new Course(3,"sachin","puri"),
                new Course(4,"luffy","D")
        );
    }

}