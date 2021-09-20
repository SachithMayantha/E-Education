package com.fernando.educational.service;

import com.fernando.educational.entity.ClassStudent;
import com.fernando.educational.entity.OnlineClass;
import com.fernando.educational.entity.Students;
import com.fernando.educational.repository.ClassRepository;
import com.fernando.educational.repository.ClassStdRepository;
import com.fernando.educational.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClassService {
    @Autowired
    ClassRepository classRepository;

    @Autowired
    ClassStdRepository classStdRepository;

    public OnlineClass addClass(OnlineClass onlineClass){
        return classRepository.save(onlineClass);
    }

    public List<OnlineClass> getClasses() {
        return classRepository.findAll();
    }

    public Optional<OnlineClass> getOneClass(String id){
        return classRepository.findById(id);
    }

    public void deleteClass(String id) {
        classRepository.deleteById(id);
    }

    public OnlineClass updateClass(OnlineClass onlineClass) {
        return classRepository.save(onlineClass);
    }

    public List<ClassStudent> getStudents() {
        return classStdRepository.findAll();
    }
}
