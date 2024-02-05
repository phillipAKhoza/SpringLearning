package com.phillip_dev.thymleafutilitymethods;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class SalesController {

    List<Record> records = Arrays.asList(
        new Record("Chair", new BigDecimal(20.99)  ,new BigDecimal(5.99) ),
        new Record("Table",  new BigDecimal(40.99 ), new BigDecimal(8.99)),
        new Record("Chair", new BigDecimal(100.99 ) , new BigDecimal(105.99)),
        new Record("Chair", new BigDecimal(200.99) , new BigDecimal(59.99)),
        new Record("Chair", new BigDecimal(150.99) , new BigDecimal(205.99))
    );


    @GetMapping("/")
    public String getSales(Model model) {
        model.addAttribute("sales", records);
        return "sales";
    }
    
    
}
