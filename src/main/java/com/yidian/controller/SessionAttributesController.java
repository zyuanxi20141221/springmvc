package com.yidian.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("/model")
@SessionAttributes(names = "name", types = String.class)
public class SessionAttributesController {

    @RequestMapping("/session.action")
    public String model(Model model) {
        model.addAttribute("name", "test attribute");
        return "success";
    }
}
