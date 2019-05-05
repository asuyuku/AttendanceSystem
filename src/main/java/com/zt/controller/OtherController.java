package com.zt.controller;

import com.zt.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class OtherController {

    @RequestMapping("/")
    public ModelAndView index(HttpServletRequest request){
        User user = (User) request.getSession().getAttribute("user");
        if(user == null){
            return new ModelAndView("redirect:/login.do");
        }
        else {
            return new ModelAndView("/success");
        }
    }

}
