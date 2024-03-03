package com.takima.backskeleton.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@Entity
@Table(name="Diploma")
public class Diploma {
    @Id
    private Long id;
    @Column(name="obtentionDate")
    private Date obtentionDate;
    @Column(name="name")
    private String name;
    @Column(name = "school")
    private String school;

    public Diploma(Long id, Date obtentionDate, String name, String school) {
        this.id=id; this.obtentionDate=obtentionDate; this.name=name; this.school=school;
    }

    public Diploma(){}
}
