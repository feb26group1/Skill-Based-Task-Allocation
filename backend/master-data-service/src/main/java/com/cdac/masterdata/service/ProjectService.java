package com.cdac.masterdata.service;

import java.util.List;

import com.cdac.masterdata.entities.Project;
import com.cdac.masterdata.entities.Task;

public interface ProjectService {

    // Project

    Project createProject(Project project);

    List<Project> getAllProjects();

    Project getProjectById(Integer id);

    // Task

    Task createTask(Task task);

    List<Task> getAllTasks();

    Task updateTask(Integer id, Task task);

    void deleteTask(Integer id);

}