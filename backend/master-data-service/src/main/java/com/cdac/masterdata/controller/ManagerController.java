package com.cdac.masterdata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.cdac.masterdata.entities.Project;
import com.cdac.masterdata.entities.Task;
import com.cdac.masterdata.service.ProjectService;

@RestController
@RequestMapping("/manager")
@CrossOrigin(origins = "http://localhost:5173")
public class ManagerController {

    @Autowired
    private ProjectService projectService;

    // ---------------- PROJECT ----------------

    @PostMapping("/projects")
    public ResponseEntity<Project> createProject(@RequestBody Project project){

        return new ResponseEntity<>(
                projectService.createProject(project),
                HttpStatus.CREATED);
    }

    @GetMapping("/projects")
    public ResponseEntity<List<Project>> getAllProjects(){

        return new ResponseEntity<>(
                projectService.getAllProjects(),
                HttpStatus.OK);
    }

    @GetMapping("/projects/{id}")
    public ResponseEntity<Project> getProjectById(@PathVariable Integer id){

        return new ResponseEntity<>(
                projectService.getProjectById(id),
                HttpStatus.OK);
    }

    // ---------------- TASK ----------------

    @PostMapping("/tasks")
    public ResponseEntity<Task> createTask(@RequestBody Task task){

        return new ResponseEntity<>(
                projectService.createTask(task),
                HttpStatus.CREATED);
    }

    @GetMapping("/tasks")
    public ResponseEntity<List<Task>> getAllTasks(){

        return new ResponseEntity<>(
                projectService.getAllTasks(),
                HttpStatus.OK);
    }

    @PutMapping("/tasks/{id}")
    public ResponseEntity<Task> updateTask(@PathVariable Integer id,
                                           @RequestBody Task task){

        return new ResponseEntity<>(
                projectService.updateTask(id, task),
                HttpStatus.OK);
    }

    @DeleteMapping("/tasks/{id}")
    public ResponseEntity<String> deleteTask(@PathVariable Integer id){

        projectService.deleteTask(id);

        return new ResponseEntity<>(
                "Task deleted successfully",
                HttpStatus.OK);
    }

}
