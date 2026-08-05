package com.cdac.transaction.service;

import java.util.List;

import com.cdac.transaction.dto.TaskEmpRequest;
import com.cdac.transaction.entities.TaskEmp;

public interface TaskEmpService {

    TaskEmp assignEmployee(TaskEmpRequest request);

    List<TaskEmp> getEmployeesForTask(Integer taskId);

    void removeEmployee(Integer taskId, String empId);

    List<TaskEmp> getTasksForEmployee(String empId);

    TaskEmp updateTaskStatus(
            Integer taskId,
            String empId,
            String status
    );
}