package com.cdac.masterdata.service;

import java.util.List;

import com.cdac.masterdata.entities.Role;
import com.cdac.masterdata.entities.SkillSet;


public interface AdminService {
    // Role
    Role createRole(Role role);

    List<Role> getAllRoles();

    // Skill
    SkillSet createSkill(SkillSet skill);

    List<SkillSet> getAllSkills();
}
