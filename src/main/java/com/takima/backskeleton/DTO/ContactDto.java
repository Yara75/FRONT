package com.takima.backskeleton.DTO;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ContactDto {
    private String type;
    private String info;
}