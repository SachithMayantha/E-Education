package com.fernando.educational.repository;

import com.fernando.educational.entity.UserAccount;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<UserAccount,String> {
//    Optional<UserAccount> findByUsername(String username);
}
