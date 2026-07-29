package com.cdac.masterdata.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	Integer id;
	@Column(name = "empid")
	String empId;
	@Column(name = "u_name")
	String name;
	@Column(name = "u_password")
	String password;

	@ManyToOne
	@JoinColumn(name = "r_id")
	Role role;

	@Column(name = "e_email")
	String email;
	@Column(name = "u_phonenumber")
	String phoneNumber;
	@Column(name = "exp")
	float exp;
}
