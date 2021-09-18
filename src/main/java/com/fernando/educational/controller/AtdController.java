package com.fernando.educational.controller;

import com.fernando.educational.entity.Attendance;
import com.fernando.educational.entity.Graph;
import com.fernando.educational.service.AtdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
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

    @GetMapping("/{userId}/{subject}")
    public Graph getAtd(@PathVariable("userId") String userId, @PathVariable("subject") String subject){

        List<Attendance> atd = atdService.getAtd(userId,subject);
        Graph graph = new Graph();
        int detected =0;

        for (int i =0; i<atd.size();i++){
            int x = Integer.parseInt(atd.get(i).getDetectedTime());
            int y = Integer.parseInt(atd.get(i).getFullTime());
            double per = (x*100/y);
            System.out.println(per);
            if (per>=50){
                detected = detected + 1;
                System.out.println(detected);
            }
        }

        graph.setReal(atd.size());
        graph.setDetected(detected);
        return graph;
    }


}
