package com.takima.backskeleton.DTO;

import lombok.Builder;
import lombok.Getter;

import java.sql.Date;

@Builder
@Getter
public class DiplomaDto {
    private Date obtentionDate;
    private String name;
    private String school;
}
