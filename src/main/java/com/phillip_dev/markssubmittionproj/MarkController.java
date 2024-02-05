package com.phillip_dev.markssubmittionproj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class MarkController {
    List<Mark> studentMarks = new ArrayList<>();

    @GetMapping("/marks")
    public String getMarks(Model model){
    
        model.addAttribute("marks",studentMarks);
        return "marks";
    }

    @GetMapping("/")
    public String markForm(Model model) {
        model.addAttribute("mark", new Mark());
        return "form";
    }

    @PostMapping("/handleSubmit")
    public String submitMark(Mark mark) {
        System.err.println(mark);
        studentMarks.add(mark);
        
        return "abc";
    }
    
    
}
