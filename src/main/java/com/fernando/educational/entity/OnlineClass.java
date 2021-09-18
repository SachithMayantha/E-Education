package com.fernando.educational.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "onlineClass")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class OnlineClass {
    @Id
    private String id;
    private String subject;
    private String date;
    private String classTime;
//    private List<Students> listStd;
}
