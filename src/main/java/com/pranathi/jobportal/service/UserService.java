package com.pranathi.jobportal.service;

import com.pranathi.jobportal.enitity.User;

import java.util.List;

public interface UserService {
    User registerUser(User user);          // Register a new user
    List<User> getAllUsers();              // Get all users
    User getUserById(Long id);             // Get user by ID
    User getUserByEmail(String email);     // Get user by Email
    void deleteUser(Long id);              // Delete user by ID
}
