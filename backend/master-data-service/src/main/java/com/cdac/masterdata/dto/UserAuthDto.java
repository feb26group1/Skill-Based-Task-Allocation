package com.cdac.masterdata.dto;

import com.cdac.masterdata.entities.Role;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAuthDto {
  
	private String empId;
    private String password;
	private Role role;

}
