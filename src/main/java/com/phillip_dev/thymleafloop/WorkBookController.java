package com.phillip_dev.thymleafloop;




import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class WorkBookController {
    List<Empoyee> employees = Arrays.asList
    (
        new Empoyee("Jim Halpert", 32, "Salesman"),
        new Empoyee("Andy Bernard", 38, "Salesman"),
        new Empoyee("Pam Beesly", 32, "Receptionist"),
        new Empoyee("Michael Scott", 49, "Regional Manager"),
        new Empoyee("Ryan Howard", 28, "Temp"),
        new Empoyee("Angela Martin", 35, "Accountant"),
        new Empoyee("Dwight Schrute", 37, "Assistant to the Regional Manager")
    );


    @GetMapping("/")
    public String getStaff(Model model) {
        model.addAttribute("employees", employees);
        return "staff";
    }
    

}
