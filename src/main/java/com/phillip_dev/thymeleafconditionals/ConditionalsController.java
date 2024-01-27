package com.phillip_dev.thymeleafconditionals;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ConditionalsController {
    @GetMapping("/")
    public String getMethodName(Model model) {
        model.addAttribute("sales", 100);

        return "conditionals";
    }
    
}
