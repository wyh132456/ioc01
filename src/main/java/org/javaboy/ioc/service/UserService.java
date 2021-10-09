package org.javaboy.ioc.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    public List<String>getAllUsers(){
        List<String> users = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            users.add("allboy"+ i);
        }
        return users;
    }
}
