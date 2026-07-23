package com.cdac.backend.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	int id;
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

	public User(int id, String empId, String name, String password, Role role, String email, String phoneNumber,
			float exp) {
		super();
		this.id = id;
		this.empId = empId;
		this.name = name;
		this.password = password;
		this.role = role;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.exp = exp;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public float getExp() {
		return exp;
	}

	public void setExp(float exp) {
		this.exp = exp;
	}

}
