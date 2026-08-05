package com.cdac.transaction.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cdac.transaction.entities.TaskEmp;

public interface TaskEmpRepository
        extends JpaRepository<TaskEmp, Integer> {

    List<TaskEmp> findByTaskId(Integer taskId);

    List<TaskEmp> findByEmpId(String empId);

    Optional<TaskEmp> findByTaskIdAndEmpId(
            Integer taskId,
            String empId);
}