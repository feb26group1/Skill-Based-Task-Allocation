package com.cdac.masterdata.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.masterdata.entities.Project;
import com.cdac.masterdata.entities.Task;
import com.cdac.masterdata.repository.ProjectRepository;
import com.cdac.masterdata.repository.TaskRepository;
import com.cdac.masterdata.service.ProjectService;

@Service
public class ProjectServiceImple implements ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private TaskRepository taskRepository;

    // ---------------- PROJECT ----------------

    @Override
    public Project createProject(Project project) {
        return projectRepository.save(project);
    }

    @Override
    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    @Override
    public Project getProjectById(Integer id) {
        return projectRepository.findById(id).orElse(null);
    }

    // ---------------- TASK ----------------

    @Override
    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    @Override
    public Task updateTask(Integer id, Task task) {

        Task existingTask = taskRepository.findById(id).orElse(null);

        if(existingTask == null)
            return null;

       // existingTask.setTaskName(task.getTaskName());
        existingTask.setDescription(task.getDescription());
        existingTask.setStartDate(task.getStartDate());
        existingTask.setEndDate(task.getEndDate());
        existingTask.setStatus(task.getStatus());
     //   existingTask.setPriority(task.getPriority());
        existingTask.setProject(task.getProject());

        return taskRepository.save(existingTask);
    }

    @Override
    public void deleteTask(Integer id) {
        taskRepository.deleteById(id);
    }

}