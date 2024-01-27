package com.phillip_dev.handlegetrequest;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class MovieController {
    @GetMapping("/")
    public ModelAndView getMovies() {
        // there a two ways to add data to the model the bellow and the commented one bellow the working one
        // another way of adding a model, an old day infact
        Map<String, Show> model = new HashMap<String, Show>();
        model.put("show1", new Show("Breaking Bad","Ozymandias", 10.0));
        model.put("show2", new Show("Attack on Titan","Hero", 9.9));
        model.put("show3", new Show("Attack on Titan","Perfect Game", 9.9));
        model.put("show4", new Show("Star Wars: The Clone Wars","Victory and Death", 9.9));
         model.put("show5", new Show("Mr. Robot","407 Proxy Authentication Required", 9.9));

        // How to add data to the model using the recent  way. this required the model passed to the handler getMovies(Model model)
        // Show show1 = new Show("Breaking Bad","Ozymandias", 10.0);
        // Show show2 = new Show("Attack on Titan","Hero", 9.9);
        // Show show3 = new Show("Attack on Titan","Perfect Game", 9.9);
        // Show show4 = new Show("Star Wars: The Clone Wars","Victory and Death", 9.9);
        // Show show5 = new Show("Mr. Robot","407 Proxy Authentication Required", 9.9);
        // model.addAttribute("show1", show1);
        // model.addAttribute("show2", show2);
        // model.addAttribute("show3", show3);
        // model.addAttribute("show4", show4);
        // model.addAttribute("show5", show5);
        return new ModelAndView("shows", model);
    }
    
}
