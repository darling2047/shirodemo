package com.example.demo.service;

import com.example.demo.domain.User;

public interface UserService {

    public User findByName(String name);
}
