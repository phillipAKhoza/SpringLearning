package com.phillip_dev.handlegetrequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MovieController {
    @GetMapping("/")
    public String getMovies() {
        return "shows";
    }
    
}
