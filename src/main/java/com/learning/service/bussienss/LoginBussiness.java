package com.learning.service.bussienss;

import com.learning.entry.User;
import com.learning.service.manager.LoginManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * create by lixihao on 2017/11/23.
 **/
@Service
public class LoginBussiness {

    @Autowired
    LoginManager loginManager;

    public String find(){
        loginManager.findUser(new User());
        return "";
    }

}
