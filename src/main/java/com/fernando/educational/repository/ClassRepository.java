package com.fernando.educational.repository;

import com.fernando.educational.entity.OnlineClass;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRepository extends MongoRepository<OnlineClass,String> {
}
