package com.fernando.educational;

import com.fernando.educational.repository.ClassRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
public class EEducationalSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(EEducationalSystemApplication.class, args);
    }

}
