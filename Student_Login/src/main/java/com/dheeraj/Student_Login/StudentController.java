package com.dheeraj.Student_Login;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @GetMapping("/")
    public String geert(){
        return "hello world";
    }
    @GetMapping("/logout")
    public String getLost(){
        return "good bye!!";
    }
}
