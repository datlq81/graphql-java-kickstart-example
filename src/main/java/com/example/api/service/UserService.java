package com.example.api.service;

import com.example.api.dto.User;
import com.example.api.dto.UserInput;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User getUserById(Long id);

    User createUser(UserInput userInput);

    User updateUser(Long id, UserInput userInput);

    Boolean deleteUser(Long id);
}
