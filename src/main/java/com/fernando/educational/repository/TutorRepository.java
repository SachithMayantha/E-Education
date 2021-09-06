package com.fernando.educational.repository;

import com.fernando.educational.entity.Tutors;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TutorRepository extends MongoRepository<Tutors,String> {
}
