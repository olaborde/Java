package com.example.hellospring.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {

    @RequestMapping(value = "")
    @ResponseBody
    public String index(HttpServletRequest request) {
        String name = request.getParameter("name");

        if ( name == null){
            name = "User";
        }
        return "Hello, "+ name;
    }

    @RequestMapping(value = "goodbye")
    @ResponseBody
    public String goodbye(){
        return "See Ya";
    }

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    @ResponseBody
    public String helloForm(){
        String html ="<form method='post'>" +
                "<input type='text' name='name' />" +
                "<input type='submit' value='Greet Me!' /> ";
        return html;
    }

    @RequestMapping(value = "hello", method = RequestMethod.POST)
    @ResponseBody
    public String helloPost(HttpServletRequest request) {

        String name = request.getParameter("name");

        return "Whats up, " + name + "!";

    }

    @RequestMapping(value = "hello/{name}")
    @ResponseBody
    public String helloUrlSegment(@PathVariable String name) {
        return "Hello, " + name;
    }
}
