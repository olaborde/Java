package com.example.hellospring.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
}
