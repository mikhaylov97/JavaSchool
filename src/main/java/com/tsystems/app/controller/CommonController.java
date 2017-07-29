package com.tsystems.app.controller;

import com.tsystems.app.service.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CommonController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/")
    public String redirectToHome() {
        return "redirect:/home";
    }

    @RequestMapping(value = "/home")
    public ModelAndView showHomePage() {
        ModelAndView modelAndView = new ModelAndView("home");
        userService.saveNewSize();
        modelAndView.addObject("user", userService.getUserByEmail("mi.mi.mikhaylov97@gmail.com"));
        modelAndView.addObject("sizes", userService.getSizes());

        return modelAndView;
    }
}
