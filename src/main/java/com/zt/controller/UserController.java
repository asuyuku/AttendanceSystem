package com.zt.controller;

import com.zt.commonUtils.AjaxResult;
import com.zt.pojo.Record;
import com.zt.pojo.User;
import com.zt.service.UserService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    @RequestMapping("studentSelectRecord.do")
    @ResponseBody
    public Map<String,Object> studentSelectRecord(HttpServletRequest request)
    {
        Map<String,Object> map=new HashMap<String,Object>();
        User user=(User)request.getSession().getAttribute("user");
        List<Record> records=userService.selectRecordService(user);
        map.put("records",records);
        return map;
    }
    
    @RequestMapping("teacherSelectRecord.do")
    @ResponseBody
    public Map<String,Object> teacherSelectRecord(HttpServletRequest request)
    {
        User user = (User)request.getSession().getAttribute("user");
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("records",userService.teacherSelectRecordService(user));
        return map;
    }

}
