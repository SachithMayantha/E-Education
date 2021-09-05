package com.fernando.educational.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Time;
import java.util.List;

@Document(collection = "onlineClass")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class OnlineClass {
    @Id
    private String id;
    private String subject;
    private String Date;
    private Time classTime;
    private List<Students> listStd;
}
