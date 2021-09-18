package com.fernando.educational.controller;

import com.fernando.educational.entity.Attendance;
import com.fernando.educational.service.AtdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/atd")
public class AtdController {

    @Autowired
    private AtdService atdService;

    @PostMapping
    public Attendance saveAtd(@RequestBody Attendance attendance){
        return atdService.saveAtd(attendance);
    }

    @GetMapping("{userId}{subject}")
    public Model getAtd(@PathVariable("userId") String userId, @PathVariable("subject") String subject){
        List<Attendance> atd = atdService.getAtd(userId,subject);
        Model model = null;
        int real =0, detected =0;

        for (int i =0; i<atd.size();i++){
            detected = detected + Integer.parseInt(atd.get(i).getDetectedTime());
            real = real + Integer.parseInt(atd.get(i).getFullTime());
        }

        model.addAttribute(detected);
        model.addAttribute(real);
        return model;
    }


}
