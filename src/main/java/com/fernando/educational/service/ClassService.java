package com.fernando.educational.service;

import com.fernando.educational.entity.OnlineClass;
import com.fernando.educational.repository.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClassService {
    @Autowired(required = true)
    ClassRepository classRepository;

    public OnlineClass addClass(OnlineClass onlineClass){
        return classRepository.save(onlineClass);
    }

    public List<OnlineClass> getClasses() {
        return classRepository.findAll();
    }

    public Optional<OnlineClass> getOneClass(String id){
        return classRepository.findById(id);
    }
}
