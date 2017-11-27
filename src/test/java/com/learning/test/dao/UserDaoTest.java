package com.learning.test.dao;

import com.learning.service.dao.UserDao;
import com.learning.test.base.BaseTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;
import com.learning.entry.User;

/**
 * create by lixihao on 2017/11/24.
 **/

public class UserDaoTest extends BaseTest{
    @Autowired
    UserDao userDao;

    @Test
    public void findUser(){
        User user = new User();
        user.name = "lixihao";
        User result = userDao.findUser(user);
        System.out.println(result.password);
    }

}
