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
    @Autowired(required = true)
    ClassService classService;

    @PostMapping
    public OnlineClass saveClass(@RequestBody OnlineClass onlineClass){
        return classService.addClass(onlineClass);
    }

    @GetMapping
    public List<OnlineClass> getClasses(){
        return classService.getClasses();
    }

    @GetMapping("{id}")
    public Optional<OnlineClass> getOneClass(@PathVariable("id") String id){
        return classService.getOneClass(id);
    }

    @DeleteMapping("{id}")
    public void deleteClass(@PathVariable("id") String id){
//        @RequestParam
        classService.deleteClass(id);
    }

    @PutMapping("{id}")
    public OnlineClass updateClass(@RequestBody OnlineClass onlineClass){
        return classService.updateClass(onlineClass);
    }
}
