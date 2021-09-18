package com.fernando.educational.repository;

import com.fernando.educational.entity.Attendance;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AtdRepository extends MongoRepository<Attendance,String> {
    List<Attendance> findByUserIdAndSubject(String userId,String subject);
}
