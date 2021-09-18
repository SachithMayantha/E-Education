package com.fernando.educational.controller;

import com.fernando.educational.entity.UserAccount;
import com.fernando.educational.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public String loginForm(@RequestBody UserAccount userAccount){
            String msg = userService.getUser(userAccount);
            return msg.toLowerCase();
    }
}
