package com.cdac.masterdata.service;

import java.util.List;

import com.cdac.masterdata.dto.TaskDto;

public interface TaskService {
    TaskDto createTask(TaskDto taskDto);
    TaskDto getTaskById(Integer id);
    List<TaskDto> getAllTasks();
    TaskDto updateTask(Integer id, TaskDto taskDto);
    void deleteTask(Integer id);
}