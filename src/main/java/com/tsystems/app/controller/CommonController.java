package com.tsystems.app.controller;

import com.tsystems.app.service.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CommonController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/")
    public String redirectToHome() {
        return "redirect:/home";
    }

    @RequestMapping(value = "/home")
    public String showHomePage() {
        return "home";
    }
}
