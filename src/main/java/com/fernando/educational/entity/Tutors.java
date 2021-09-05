package com.fernando.educational.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tutors")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Tutors {
    @Id
    private String id;
    private String tutor_name;
    private String tutor_email;
    private String tutor_password;

}
