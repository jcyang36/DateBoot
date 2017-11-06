package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Controller
public class HomeController {
    //get the current time

    LocalDateTime rightNow=LocalDateTime.now();
   Date now = new Date();
    SimpleDateFormat simpleDateFormat=new SimpleDateFormat("EEEE");
    DateTimeFormatter shortMonthFormat=DateTimeFormatter.ofPattern("dd MMM yyyy");
    @RequestMapping("/")
    public String homePage(Model model){
        model.addAttribute("mydate", "Today is: "+ simpleDateFormat.format(now));
        model.addAttribute("myvar","Current date:  " +rightNow.format(shortMonthFormat) );
        return "intro";
    }
}
