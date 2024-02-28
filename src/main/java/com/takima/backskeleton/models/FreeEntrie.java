package com.takima.backskeleton.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "FreeEntrie")
public class FreeEntrie {
    @Id
    private Long id;
    @Column(name = "section")
    private String section;
    @Column(name = "info")
    private String info;

    public FreeEntrie(Long id, String section, String info) {
        this.id=id; this.section=section; this.info=info;
    }

    public FreeEntrie() {}
}
