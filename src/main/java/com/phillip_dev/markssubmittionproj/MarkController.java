package com.phillip_dev.markssubmittionproj;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MarkController {
    @GetMapping("/marks")
    public String getMarks(Model model){
        Mark mark = new Mark("Phillip", "Programming", 90);
        model.addAttribute("mark",mark);
        return "marks";
    }
}
