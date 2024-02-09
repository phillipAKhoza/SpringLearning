package com.phillip_dev.fiels_validation01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class SocialController {

    @GetMapping("/")
    public String getForm() {

        return "sign-up";
    }
    @GetMapping("/result")
    public String getResult() {
        return "result";
    }
    
    
}
