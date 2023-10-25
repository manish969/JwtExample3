package com.jwt.example.services;

import com.jwt.example.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> store = new ArrayList<>();

    public UserService() {

        store.add(new User(UUID.randomUUID().toString(), "Manish Kumar", "mani@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Krishna Kumar", "krishna@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Elvish yadav", "elvish@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Nikhil Kumar", "nikhil@gmail.com"));

    }

    public List<User> getUsers(){
        return this.store;
    }
}
