package com.sphz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {
    @RequestMapping("/test")
    public String test(Model model) {
        model.addAttribute("msg", "hello,springboot");
        return "test";
    }
}
