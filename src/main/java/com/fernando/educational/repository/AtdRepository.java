package com.fernando.educational.repository;

import com.fernando.educational.entity.Attendance;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtdRepository extends MongoRepository<Attendance,String> {
}
