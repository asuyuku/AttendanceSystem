package com.zt.controller;

import com.zt.pojo.User;
import com.zt.service.asSignInService;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by tjzha on 2019/5/10.
 */
@Controller
public class asSignInController
{
    asSignInService signInService;
    @RequestMapping("/asSignInPage.do")
    public ModelAndView asSignInPage()
    {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("SignInPage");
        return mv;

    }
    @RequestMapping("asSignIn.do")
    public JSONObject asSignIn(User user,double lng,double lat)
    {
        JSONObject jsonObject=new JSONObject();
        if(signInService.signIn(user,lng,lat))
        jsonObject.put("result",true);
        jsonObject.put("result",false);
        return jsonObject;
    }
}
