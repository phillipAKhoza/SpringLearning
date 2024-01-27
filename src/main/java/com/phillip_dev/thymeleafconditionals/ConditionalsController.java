package com.phillip_dev.thymeleafconditionals;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;




@Controller
public class ConditionalsController {
    @GetMapping("/")
    public String getConditionals(Model model) {
        model.addAttribute("sales", 100);
        model.addAttribute("product", "chair");

        return "conditionals";
    }
    @GetMapping("/sign")
    public String getSign(Model model) {
        model.addAttribute("speed", 65);
        return "sign";
    }
    @GetMapping("/art")
    public String getPaining(Model model) {
        model.addAttribute("painting", "starry-night");

        return "painting";
    }
    
    
}

