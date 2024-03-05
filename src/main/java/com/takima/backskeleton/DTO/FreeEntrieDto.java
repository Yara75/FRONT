package com.takima.backskeleton.DTO;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class FreeEntrieDto {
    private String section;
    private String info;
}
