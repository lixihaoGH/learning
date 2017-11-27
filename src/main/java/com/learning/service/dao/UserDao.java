package com.learning.service.dao;

import com.learning.entry.User;
import org.springframework.stereotype.Repository;

/**
 * create by lixihao on 2017/11/23.
 **/

@Repository
public interface UserDao {
    User findUser(User user);
}
