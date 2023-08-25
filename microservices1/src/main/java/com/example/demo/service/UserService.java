package com.example.demo.service;

import java.util.List;

import com.example.demo.Entity.User;

public interface UserService {
	
	User saveUser(User user);

    //get all user
    List<User> getAllUser();

    //get single user of given userId

    User getUser(String id);

}
