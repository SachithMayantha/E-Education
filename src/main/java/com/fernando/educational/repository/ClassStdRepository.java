package com.fernando.educational.repository;

import com.fernando.educational.entity.ClassStudent;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassStdRepository extends MongoRepository<ClassStudent,String> {
}
