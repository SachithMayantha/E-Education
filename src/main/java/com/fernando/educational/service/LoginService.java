package com.fernando.educational.service;

import com.fernando.educational.entity.Students;
import com.fernando.educational.entity.Tutors;
import com.fernando.educational.repository.StudentRepository;
import com.fernando.educational.repository.TutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginService {
    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private TutorRepository tutorRepository;

    public List<Students> getStudents(){
        return studentRepository.findAll();
    }

    public List<Tutors> getTutors(){
        return tutorRepository.findAll();}
}
