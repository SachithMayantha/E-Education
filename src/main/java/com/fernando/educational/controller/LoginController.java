package com.fernando.educational.controller;

import com.fernando.educational.entity.Students;
import com.fernando.educational.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private LoginService loginService;

    @GetMapping
    public List<Students> getStudents(){
        return loginService.getStudents();
    }
}
