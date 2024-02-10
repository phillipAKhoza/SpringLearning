package com.phillip_dev.markssubmittionproj.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.phillip_dev.markssubmittionproj.Constants;
import com.phillip_dev.markssubmittionproj.Mark;
import com.phillip_dev.markssubmittionproj.repository.MarkRepository;

import jakarta.validation.Valid;



@Controller
public class MarkController {
    MarkRepository markRepository = new MarkRepository();
    // this method only handles the data that needs to be displayed
    @GetMapping("/marks")
    public String getMarks(Model model){
    
        model.addAttribute("marks",markRepository.getMarks());
        return "marks";
    }

    // this is the form request handler. when the user whats to either capture new or edit data we call this form
    // the form has a parameter which is an id for updating existing data
    // the form parameter is not required so we can cater for new creation of data
    // upon the calling of the method we check if the data exists or not if it exist we sent the data to the form
    // if the data doesnt exit we create a new mark object
    @GetMapping("/")
    public String markForm(Model model, @RequestParam(required = false) String id) {
        int index =getMarkIndex(id);
        model.addAttribute("mark",index == Constants.NOT_FOUND ? new Mark() : markRepository.getMark(index));
        return "form";
    }
    // this is a handler called when you submit the form
    // the handler will get the model of the submited form
    @PostMapping("/handleSubmit")
    public String submitForm(@Valid Mark mark, BindingResult result) {
        int index = getMarkIndex(mark.getId());
        // first you need to check if the data being submitted exits or not and we check that via a getMarkIndex method
        // if the data exits we update .set if not we add .add
        if(result.hasErrors()) return "form";
        if(index == Constants.NOT_FOUND){
          markRepository.addMark(mark);
        }else{
            markRepository.updateMark(index, mark);
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
