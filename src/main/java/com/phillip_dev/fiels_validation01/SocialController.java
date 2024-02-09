package com.phillip_dev.fiels_validation01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class SocialController {

    @GetMapping("/")
    public String getForm(Model model) {
        model.addAttribute("user", new User());
        return "sign-up";
    }
    @GetMapping("/result")
    public String getResult() {
        return "result";
    }
    
    @PostMapping("/submitUser")
    public String postMethodName(User user) {
        
        
        return "redirect:/result";
    }
    
}
