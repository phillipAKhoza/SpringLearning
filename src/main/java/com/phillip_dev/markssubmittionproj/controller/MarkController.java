package com.phillip_dev.markssubmittionproj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.phillip_dev.markssubmittionproj.Mark;
import com.phillip_dev.markssubmittionproj.service.MarkService;

import jakarta.validation.Valid;



@Controller
public class MarkController {
    @Autowired
    MarkService markService;


    // this method only handles the data that needs to be displayed
    @GetMapping("/marks")
    public String getMarks(Model model){
    
        model.addAttribute("marks",markService.getMarks());
        return "marks";
    }

    // this is the form request handler. when the user whats to either capture new or edit data we call this form
    // the form has a parameter which is an id for updating existing data
    // the form parameter is not required so we can cater for new creation of data

    @GetMapping("/")
    public String markForm(Model model, @RequestParam(required = false) String id) {
        model.addAttribute("mark",markService.getMarkById(id));
        return "form";
    }

    // this is a handler called when you submit the form
    // the handler will get the object of the submited form
    @PostMapping("/handleSubmit")
    public String submitForm(@Valid Mark mark, BindingResult result) {
        markService.submitMark(mark);
        // after the add/update has been done we perform a redirect tot the marks screen
        return "redirect:/marks";
    }

    
}
