package com.cdac.masterdata.serviceimple;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.masterdata.dto.TaskDto;
import com.cdac.masterdata.entities.Project;
import com.cdac.masterdata.entities.Task;
import com.cdac.masterdata.exception.ResourceNotFoundException;
import com.cdac.masterdata.repository.ProjectRepository;
import com.cdac.masterdata.repository.TaskRepository;
import com.cdac.masterdata.service.TaskService;

@Service
public class TaskServiceimpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private ProjectRepository projectRepository;

    @Override
    public TaskDto createTask(TaskDto taskDto) {
        Task task = toEntity(taskDto);
        return toDto(taskRepository.save(task));
    }

    @Override
    public TaskDto getTaskById(Integer id) {
        Task task = taskRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Task not found with id: " + id));
        return toDto(task);
    }

    @Override
    public List<TaskDto> getAllTasks() {
        return taskRepository.findAll()
                .stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public TaskDto updateTask(Integer id, TaskDto taskDto) {
        Task existing = taskRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Task not found with id: " + id));

        existing.setDescription(taskDto.getDescription());
        existing.setStatus(taskDto.getStatus());
        existing.setStartDate(taskDto.getStartDate());
        existing.setEndDate(taskDto.getEndDate());

        if (taskDto.getProjectId() != null) {
            Project project = projectRepository.findById(taskDto.getProjectId())
                    .orElseThrow(() -> new ResourceNotFoundException(
                            "Project not found with id: " + taskDto.getProjectId()));
            existing.setProject(project);
        }

        return toDto(taskRepository.save(existing));
    }

    @Override
    public void deleteTask(Integer id) {
        if (!taskRepository.existsById(id)) {
            throw new ResourceNotFoundException("Task not found with id: " + id);
        }
        taskRepository.deleteById(id);
    }

    private Task toEntity(TaskDto dto) {
        Task task = new Task();
        task.setDescription(dto.getDescription());
        task.setStatus(dto.getStatus());
        task.setStartDate(dto.getStartDate());
        task.setEndDate(dto.getEndDate());

        if (dto.getProjectId() != null) {
            Project project = projectRepository.findById(dto.getProjectId())
                    .orElseThrow(() -> new ResourceNotFoundException(
                            "Project not found with id: " + dto.getProjectId()));
            task.setProject(project);
        }
        return task;
    }

    private TaskDto toDto(Task task) {
        TaskDto dto = new TaskDto();
        dto.setTaskId(task.getTaskId());
        dto.setDescription(task.getDescription());
        dto.setStatus(task.getStatus());
        dto.setStartDate(task.getStartDate());
        dto.setEndDate(task.getEndDate());
        if (task.getProject() != null) {
            dto.setProjectId(task.getProject().getProjectId()); // match your Project entity's getter
        }
        return dto;
    }
}