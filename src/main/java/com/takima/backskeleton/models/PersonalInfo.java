package com.takima.backskeleton.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;


@Setter
@Getter
@Entity
@Table(name = "personalinfo")
public class PersonalInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "surname")
    private String surname;

    @Column(name = "name")
    private String name;

    @Column(name = "birth")
    private Date birth;

    public PersonalInfo() {
        // Constructeur par défaut
    }

    public PersonalInfo(String surname, String name, Date birth) {
        this.surname = surname;
        this.name = name;

    }
}