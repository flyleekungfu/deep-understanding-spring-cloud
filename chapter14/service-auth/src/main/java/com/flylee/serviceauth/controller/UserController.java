package com.flylee.serviceauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * 用户控制层
 *
 * @author flylee
 * @date 2019/9/9 15:55
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/current")
    public Principal getUser(Principal principal){
        return principal;
    }
}
