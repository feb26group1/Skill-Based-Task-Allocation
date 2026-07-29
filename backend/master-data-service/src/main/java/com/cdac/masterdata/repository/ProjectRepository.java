package com.cdac.masterdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cdac.masterdata.entities.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer> {

}
