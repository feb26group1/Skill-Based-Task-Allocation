package com.cdac.masterdata.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.masterdata.dto.UserAuthDto;
import com.cdac.masterdata.dto.UserDto;
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
    public UserDto getUserById(String empId) {

        User user = userRepository.findByEmpId(empId);

        if (user == null) {
            return null;
        }

        UserDto dto = new UserDto();

        dto.setId(user.getId());
        dto.setEmpId(user.getEmpId());
        dto.setName(user.getName());
        dto.setRole(user.getRole());
        dto.setEmail(user.getEmail());
        dto.setPhoneNumber(user.getPhoneNumber());
        dto.setExp(user.getExp());

        return dto;
    }

    @Override
    public UserAuthDto getUserForAuthentication(String empId) {

        User user = userRepository.findByEmpId(empId);

        if (user == null) {
            return null;
        }

        UserAuthDto dto = new UserAuthDto();

        dto.setEmpId(user.getEmpId());
        dto.setPassword(user.getPassword());
        dto.setRole(user.getRole());

        return dto;
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
