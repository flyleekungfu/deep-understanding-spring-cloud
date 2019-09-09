package com.flylee.servicehi.controller;

import com.flylee.servicehi.domain.User;
import com.flylee.servicehi.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

/**
 * 用户控制层
 *
 * @author flylee
 * @date 2019/9/9 15:55
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @PostMapping("/registry")
    public User createUser(@RequestParam("username") String username, @RequestParam("password") String password){
        return userService.create(username, password);
    }

}
