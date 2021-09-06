package com.fernando.educational.controller;

import com.fernando.educational.entity.Login;
import com.fernando.educational.entity.Students;
import com.fernando.educational.entity.Tutors;
import com.fernando.educational.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private LoginService loginService;

    @PostMapping
    public String loginForm(@RequestBody Login login){
//        ModelMap modelMap = null;
        String  msg = "Username or Password Error.!";
        String role = login.getRole().toLowerCase();
        String username = login.getUsername().toLowerCase();
        String password = login.getPassword().toLowerCase();
        String auth = username+password;

        if (role.equals("student")){
            List<Students> st = loginService.getStudents();

            for (int i=0; i<st.size(); i++){

                 if(auth.equals(st.get(i).getStudent_email().toLowerCase()+st.get(i).getStudent_password().toLowerCase())){
//                     msg = "Student";
                     msg = "Student";
                 }

            }

        }
        if (role.equals("tutor")){
            List<Tutors> tu = loginService.getTutors();

            for (int i=0; i<tu.size(); i++){

                if(auth.equals(tu.get(i).getTutor_email().toLowerCase()+tu.get(i).getTutor_password().toLowerCase())){
                    System.out.println("Yes. Done");
//                    msg = "Tutor";
                    msg = "Tutor";
                }

            }

        }else {
//            modelMap.addAttribute("User Role Problem.!", login);

        }
//        return modelMap;
        return msg;
    }
}
