package com.cdac.transaction.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "task_emp")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskEmp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "t_r_id")
    private Integer id;

    @Column(name = "t_id", nullable = false)
    private Integer taskId;

    @Column(name = "u_id", nullable = false)
    private String empId;

    @Column(nullable = false)
    private String status;

}