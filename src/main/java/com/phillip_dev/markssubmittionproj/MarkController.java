package com.phillip_dev.markssubmittionproj;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class MarkController {
    List<Mark> studentMarks = new ArrayList<>();

    @GetMapping("/marks")
    public String getMarks(Model model){
    
        model.addAttribute("marks",studentMarks);
        return "marks";
    }

    @GetMapping("/")
    public String markForm(Model model, @RequestParam(required = false) String id) {
        
        model.addAttribute("mark",getMarkIndex(id) == -1 ? new Mark() : studentMarks.get(getMarkIndex(id)));
        return "form";
    }

    @PostMapping("/handleSubmit")
    public String submitForm(Mark mark) {
        int index = getMarkIndex(mark.getId());
        if(index == -1){
          studentMarks.add(mark);
        }else{
            studentMarks.set(index, mark);
        }
        
        
        return "redirect:/marks";
    }
    
    public Integer getMarkIndex(String id){
        for(int i =0; i < studentMarks.size(); i++ ){
            if(studentMarks.get(i).getId().equals(id)) return i;
        }
        return -1;
    }
    
}
