package com.fernando.educational.service;

import com.fernando.educational.entity.Students;
import com.fernando.educational.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Students> getStudents(){
        return studentRepository.findAll();
    }
}
