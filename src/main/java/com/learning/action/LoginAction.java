package com.learning.action;

import com.learning.entry.User;
import com.learning.service.bussienss.LoginBussiness;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * create by lixihao on 2017/11/23.
 **/
@Controller
@RequestMapping(value = "/")
public class LoginAction {

    @Autowired
    LoginBussiness loginBussiness;

    @RequestMapping(value = "login")
    public String login() {
    /*String result = loginBussiness.find(user);
        return result;*/
        return "index";
    }
}
