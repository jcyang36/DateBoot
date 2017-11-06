package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
public class HomeController {
    //get the current time
    LocalDateTime rightNow=LocalDateTime.now();
    DateTimeFormatter shortMonthFormat=DateTimeFormatter.ofPattern("dd MMM yyyy");
    @RequestMapping("/")
    public String homePage(Model model){
        model.addAttribute("myvar","Current date:  " +rightNow.format(shortMonthFormat) );
        return "intro";
    }
}
