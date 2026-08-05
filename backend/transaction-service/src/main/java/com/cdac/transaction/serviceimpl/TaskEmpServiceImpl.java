package com.cdac.transaction.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.transaction.dto.TaskEmpRequest;
import com.cdac.transaction.entities.TaskEmp;
import com.cdac.transaction.repository.TaskEmpRepository;
import com.cdac.transaction.service.TaskEmpService;

@Service
public class TaskEmpServiceImpl implements TaskEmpService {

    @Autowired
    private TaskEmpRepository taskEmpRepository;

    @Override
    public TaskEmp assignEmployee(TaskEmpRequest request) {

        TaskEmp taskEmp = new TaskEmp();

        taskEmp.setTaskId(request.getTaskId());
        taskEmp.setEmpId(request.getEmpId());
        taskEmp.setStatus("ASSIGNED");

        return taskEmpRepository.save(taskEmp);
    }

    @Override
    public List<TaskEmp> getEmployeesForTask(Integer taskId) {

        return taskEmpRepository.findByTaskId(taskId);
    }

    @Override
    public void removeEmployee(
            Integer taskId,
            String empId) {

        TaskEmp taskEmp =
                taskEmpRepository
                        .findByTaskIdAndEmpId(taskId, empId)
                        .orElse(null);

        if (taskEmp != null) {
            taskEmpRepository.delete(taskEmp);
        }
    }

    @Override
    public List<TaskEmp> getTasksForEmployee(String empId) {

        return taskEmpRepository.findByEmpId(empId);
    }

    @Override
    public TaskEmp updateTaskStatus(
            Integer taskId,
            String empId,
            String status) {

        TaskEmp taskEmp =
                taskEmpRepository
                        .findByTaskIdAndEmpId(taskId, empId)
                        .orElse(null);

        if (taskEmp == null) {
            return null;
        }

        taskEmp.setStatus(status);

        return taskEmpRepository.save(taskEmp);
    }
}