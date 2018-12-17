package com.example.cheesemvc.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("cheese")
public class CheeseController {

    @RequestMapping(value = "")
    public String index(Model model){
        String title = "My Cheeses";
        model.addAttribute("title", title);
        return "cheese/index";
    }
}
