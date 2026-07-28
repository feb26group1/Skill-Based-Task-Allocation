package com.cdac.masterdata.service;

import java.util.List;

import com.cdac.masterdata.entities.User;


public interface UserService {

    User addUser(User user);

    List<User> getAllUsers();

    User getUserById(String empId);

    User updateUser(String empId, User user);

    void deleteUser(String empId);
}
