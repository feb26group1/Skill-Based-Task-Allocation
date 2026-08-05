package com.cdac.masterdata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.cdac.masterdata.dto.UserDto;
import com.cdac.masterdata.entities.Role;
import com.cdac.masterdata.entities.SkillSet;
import com.cdac.masterdata.entities.User;
import com.cdac.masterdata.service.AdminService;
import com.cdac.masterdata.service.UserService;



@RestController
@RequestMapping("/admin")
@CrossOrigin(origins = "http://localhost:5173")
public class AdminController {

    @Autowired
    private UserService userService;

    @Autowired
    private AdminService adminService;

    // User APIs

    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUsers() {
        return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);
    }

    @GetMapping("/users/{empId}")
    public ResponseEntity<UserDto> getUserByEmpId(@PathVariable String empId) {
        return new ResponseEntity<>(userService.getUserById(empId), HttpStatus.OK);
    }

    @PostMapping("/users")
    public ResponseEntity<User> addUser(@RequestBody User user) {
        return new ResponseEntity<>(userService.addUser(user), HttpStatus.CREATED);
    }

    @PutMapping("/users/{empId}")
    public ResponseEntity<User> updateUser(@PathVariable String empId,
            @RequestBody User user) {
        return new ResponseEntity<>(userService.updateUser(empId, user), HttpStatus.OK);
    }

    @DeleteMapping("/users/{empId}")
    public ResponseEntity<String> deleteUser(@PathVariable String empId) {

        userService.deleteUser(empId);

        return new ResponseEntity<>("User Deleted Successfully", HttpStatus.OK);
    }

    // Role

    @PostMapping("/roles")
    public ResponseEntity<Role> addRole(@RequestBody Role role) {
        return new ResponseEntity<>(adminService.createRole(role), HttpStatus.CREATED);
    }

    @GetMapping("/roles")
    public ResponseEntity<List<Role>> getAllRoles() {
        return new ResponseEntity<>(adminService.getAllRoles(), HttpStatus.OK);
    }

    // Skill

    @PostMapping("/skills")
    public ResponseEntity<SkillSet> addSkill(@RequestBody SkillSet skill) {
        return new ResponseEntity<>(adminService.createSkill(skill), HttpStatus.CREATED);
    }

    @GetMapping("/skills")
    public ResponseEntity<List<SkillSet>> getAllSkills() {
        return new ResponseEntity<>(adminService.getAllSkills(), HttpStatus.OK);
    }

}