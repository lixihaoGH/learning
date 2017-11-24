package com.learning.service.manager;

import com.learning.service.api.LoginApi;
import com.learning.service.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * create by lixihao on 2017/11/23.
 **/

@Service
public class LoginManager {

    @Autowired
    LoginApi loginApi;
    @Autowired
    UserDao userDao;
}
