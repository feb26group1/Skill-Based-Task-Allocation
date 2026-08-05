package com.cdac.masterdata.dto;

import com.cdac.masterdata.entities.Role;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

	Integer id;
	String empId;
	String name;
	Role role;
	String email;
	String phoneNumber;
	float exp;
}
