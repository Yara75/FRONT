package com.takima.backskeleton.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@Entity
@Table(name="Diploma")
public class Diploma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="obtentiondate")
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
