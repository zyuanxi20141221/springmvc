package com.yidian.controller;

import com.yidian.service.RoleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RoleController {

    private RoleService roleService;


    public ModelAndView list() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("roleList", roleService.list());
        modelAndView.setViewName("role-list");
        return modelAndView;

    }

}
