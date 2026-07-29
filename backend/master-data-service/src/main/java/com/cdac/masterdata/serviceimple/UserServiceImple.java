package com.cdac.masterdata.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.masterdata.entities.User;
import com.cdac.masterdata.repository.UserRepository;
import com.cdac.masterdata.service.UserService;


@Service
public class UserServiceImple implements UserService {

    @Autowired
    UserRepository userRepository;

  

    @Override
    public User addUser(User user) {

        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {

        return userRepository.findAll();
    }

    @Override
    public User getUserById(String empId) {

        return userRepository.findByEmpId(empId);
    }

    @Override
    public User updateUser(String empId, User user) {

        User existingUser = userRepository.findByEmpId(empId);

        if (existingUser == null) {
            return null;
        }

        existingUser.setEmpId(user.getEmpId());
        existingUser.setName(user.getName());
        existingUser.setPassword(user.getPassword());
        existingUser.setEmail(user.getEmail());
        existingUser.setPhoneNumber(user.getPhoneNumber());
        existingUser.setExp(user.getExp());
        existingUser.setRole(user.getRole());

        return userRepository.save(existingUser);
    }

    @Override
    public void deleteUser(String empId) {

        User existingUser = userRepository.findByEmpId(empId);

        if (existingUser != null) {
            userRepository.delete(existingUser);
        }
    }

}
