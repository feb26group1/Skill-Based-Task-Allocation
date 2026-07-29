package com.cdac.masterdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cdac.masterdata.entities.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {

}
