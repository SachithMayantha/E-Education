package com.fernando.educational.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter @Setter @NoArgsConstructor
@AllArgsConstructor
public class Attendance{
    
    private String userId;
    private String detectedTime;
    private String fullTime;
    private String subject;
}
