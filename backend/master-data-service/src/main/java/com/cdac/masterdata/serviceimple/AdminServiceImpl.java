package com.cdac.masterdata.serviceimple;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.masterdata.entities.Role;
import com.cdac.masterdata.entities.SkillSet;
import com.cdac.masterdata.repository.RoleRepository;
import com.cdac.masterdata.repository.SkillRepository;
import com.cdac.masterdata.service.AdminService;


@Service
public class AdminServiceImpl implements AdminService {
  
    @Autowired
    RoleRepository roleRepository;

    @Autowired
    private SkillRepository skillRepository;

    //ROLE
     @Override
    public Role createRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    //SKILL

     @Override
    public SkillSet createSkill(SkillSet skill) {
        return skillRepository.save(skill);
    }

    @Override
    public List<SkillSet> getAllSkills() {
        return skillRepository.findAll();
    }

}
