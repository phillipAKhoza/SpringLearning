package com.phillip_dev.markssubmittionproj;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MarkController {
    List<Mark> studentMarks = Arrays.asList(
        new Mark("Phillip", "Programming", 90),
        new Mark("Nkateko", "Maths", 75),
        new Mark("Mpendulo", "OOP", 95)
    );

    @GetMapping("/marks")
    public String getMarks(Model model){
    
        model.addAttribute("marks",studentMarks);
        return "marks";
    }

    @GetMapping("/form")
    public String markForm(Model model) {
        model.addAttribute("mark", new Mark());
        return "form";
    }
    
}
