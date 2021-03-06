package com.afei.ssm.service;

import com.afei.ssm.dao.UserMapper;
import com.afei.ssm.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * created by cxming on 2019/9/26
 */
@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public User getUser(Integer id) {
        return userMapper.selectById(id);
    }

}
