package com.fernando.educational.service;

import com.fernando.educational.entity.Attendance;
import com.fernando.educational.repository.AtdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AtdService {

    @Autowired
    private AtdRepository atdRepository;

    public Attendance saveAtd(Attendance attendance){
        return atdRepository.save(attendance);
    }
}
