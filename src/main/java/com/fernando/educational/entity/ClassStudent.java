package com.fernando.educational.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "students")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class ClassStudent {
    private String id;
    private String student_name;
}
