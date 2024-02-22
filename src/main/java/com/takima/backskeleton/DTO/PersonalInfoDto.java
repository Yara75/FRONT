package com.takima.backskeleton.DTO;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class PersonalInfoDto {
    private String item;
    private String value;
}
