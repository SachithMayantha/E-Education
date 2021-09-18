package com.fernando.educational.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "useraccounts")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class UserAccount {
    private String user_id;
    private String user_email;
    private String user_password;
    private String user_type;
}
