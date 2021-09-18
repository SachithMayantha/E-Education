package com.fernando.educational.controller;

import com.fernando.educational.entity.OnlineClass;
import com.fernando.educational.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/class")
public class ClassController {
    @Autowired
    ClassService classService;

    @PostMapping
    public OnlineClass saveClass(@RequestBody OnlineClass onlineClass) {
        return classService.addClass(onlineClass);
    }

    @GetMapping
    public List<OnlineClass> getClasses() {
        return classService.getClasses();
    }

    @GetMapping("{id}")
    public Optional<OnlineClass> getOneClass(@PathVariable("id") String id) {
        return classService.getOneClass(id);
    }

    @DeleteMapping
    public String deleteClass(@RequestParam String id) {
        try {
            classService.deleteClass(id);
            return "ok";
        } catch (Exception e) {
            return "fail";
        }

    }

    @PutMapping
    public String updateClass(@RequestBody OnlineClass onlineClass) {
        try {
            classService.updateClass(onlineClass);
            return "ok";
        } catch (Exception e) {
            return "fail";
        }
    }
}
