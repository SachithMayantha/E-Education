package com.fernando.educational.controller;

import com.fernando.educational.service.AtdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atd")
public class AtdController {

    @Autowired
    private AtdService atdService;


}
