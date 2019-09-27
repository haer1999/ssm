package com.afei.ssm.controller;

import com.afei.ssm.entity.User;
import com.afei.ssm.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by cxming on 2019/9/26
 */
@RestController
@Slf4j
public class UserApi {

    @Autowired
    UserService userService;

    @GetMapping("/getUser")
    public User getUser(Integer id) {
        log.info("getUser");
        return userService.getUser(id);
    }

}
