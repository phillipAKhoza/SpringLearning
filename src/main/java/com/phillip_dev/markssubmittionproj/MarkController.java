package com.phillip_dev.markssubmittionproj;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MarkController {
    @GetMapping("/hello")
    public String sayHello(){
        return "Somehtmlview";
    }
}
