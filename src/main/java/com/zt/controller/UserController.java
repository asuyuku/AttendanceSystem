package com.zt.controller;

import com.zt.commonUtils.AjaxResult;
import com.zt.pojo.User;
import com.zt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login.do")
    public ModelAndView login(User user, HttpServletRequest request){
        if(user.getNumber() == null || user.getNumber().isEmpty()){
            return new ModelAndView("/asLogin","message","用户名不能为空！");
        }
        if(user.getPassword() == null || user.getPassword().isEmpty()){
            return new ModelAndView("/asLogin","message","密码不能为空！");
        }
        user = userService.login(user);
        if(user == null){
            return new ModelAndView("/asLogin","message","用户名或者密码错误！");
        }
        else{
            request.getSession().setAttribute("user",user);
            return new ModelAndView("/success");
        }
    }
}
