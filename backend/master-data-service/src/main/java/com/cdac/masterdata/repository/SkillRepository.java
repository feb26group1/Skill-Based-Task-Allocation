package com.cdac.masterdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cdac.masterdata.entities.SkillSet;

@Repository
public interface SkillRepository  extends JpaRepository<SkillSet,Integer>{

    
} 