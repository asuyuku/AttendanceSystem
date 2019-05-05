package com.zt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class testController {

    @RequestMapping(value = "/test.do")
    public ModelAndView testPage(){
        ModelAndView modelAndView = new ModelAndView("/11");
        return modelAndView;
    }
}
