package com.cdac.masterdata.dto;

import java.time.LocalDate;

import com.cdac.masterdata.enums.TaskStatus;

import lombok.Data;

@Data
public class TaskDto {
    private Integer taskId;
    private Integer projectId;
    private String description;
    private TaskStatus status;
    private LocalDate startDate;
    private LocalDate endDate;
}