package com.fernando.educational.service;

import com.fernando.educational.entity.UserAccount;
import com.fernando.educational.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public String getUser(UserAccount userAccount) {
        List<UserAccount> userAccounts = userRepository.findAll();
        String msg = "Invalid Username or Password";
        for (int i =0; i<userAccounts.size();i++){
            if (userAccounts.get(i).getUser_email().equals(userAccount.getUser_email())){
                if (userAccounts.get(i).getUser_password().equals(userAccount.getUser_password())){
                    msg = userAccounts.get(i).getUser_type()+" "+userAccounts.get(i).getUser_id();
                }
            }
        }

        return msg;
    }
}
