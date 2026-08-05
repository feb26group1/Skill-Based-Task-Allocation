package com.cdac.transaction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.cdac.transaction.dto.TaskEmpRequest;
import com.cdac.transaction.dto.TaskStatusRequest;
import com.cdac.transaction.entities.TaskEmp;
import com.cdac.transaction.service.TaskEmpService;

@RestController
@RequestMapping("/transaction")
@CrossOrigin(origins = "http://localhost:5173")
public class TaskEmpController {

    @Autowired
    private TaskEmpService taskEmpService;

    // Assign employee to task
    @PostMapping("/tasks/{taskId}/employees")
    public ResponseEntity<TaskEmp> assignEmployee(
            @PathVariable Integer taskId,
            @RequestBody TaskEmpRequest request) {

        request.setTaskId(taskId);

        return new ResponseEntity<>(
                taskEmpService.assignEmployee(request),
                HttpStatus.CREATED
        );
    }

    // Get employees assigned to task
    @GetMapping("/tasks/{taskId}/employees")
    public ResponseEntity<List<TaskEmp>> getEmployees(
            @PathVariable Integer taskId) {

        return ResponseEntity.ok(
                taskEmpService.getEmployeesForTask(taskId)
        );
    }

    // Remove employee from task
    @DeleteMapping(
            "/tasks/{taskId}/employees/{empId}"
    )
    public ResponseEntity<String> removeEmployee(
            @PathVariable Integer taskId,
            @PathVariable String empId) {

        taskEmpService.removeEmployee(taskId, empId);

        return ResponseEntity.ok(
                "Employee removed from task"
        );
    }

    // Get all assignments for employee
    @GetMapping("/employees/{empId}/tasks")
    public ResponseEntity<List<TaskEmp>> getEmployeeTasks(
            @PathVariable String empId) {

        return ResponseEntity.ok(
                taskEmpService.getTasksForEmployee(empId)
        );
    }

    // Update employee-specific task status
    @PutMapping(
            "/employees/{empId}/tasks/{taskId}/status"
    )
    public ResponseEntity<TaskEmp> updateStatus(
            @PathVariable String empId,
            @PathVariable Integer taskId,
            @RequestBody TaskStatusRequest request) {

        return ResponseEntity.ok(
                taskEmpService.updateTaskStatus(
                        taskId,
                        empId,
                        request.getStatus()
                )
        );
    }
}