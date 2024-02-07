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
        int index =getMarkIndex(id);
        model.addAttribute("mark",index == Constants.NOT_FOUND ? new Mark() : studentMarks.get(index));
        return "form";
    }
    // this is a handler called when you submit the form
    // the handler will get the model of the submited form
    @PostMapping("/handleSubmit")
    public String submitForm(Mark mark) {
        int index = getMarkIndex(mark.getId());
        // first you need to check if the data being submitted exits or not and we check that via a getMarkIndex method
        // if the data exits we update .set if not we add .add
        if(index == Constants.NOT_FOUND){
          studentMarks.add(mark);
        }else{
            studentMarks.set(index, mark);
        }
        
        // after the add/update has been done we perform a redirect tot the marks screen
        return "redirect:/marks";
    }
    // this is a methose that checks if data exists. we iterate on the array list and compare the ids and if the id is fount we return it
    // if the id is not found we return a 404 constatnt
    public Integer getMarkIndex(String id){
        for(int i =0; i < studentMarks.size(); i++ ){
            if(studentMarks.get(i).getId().equals(id)) return i;
        }
        return Constants.NOT_FOUND;
    }
    
}
