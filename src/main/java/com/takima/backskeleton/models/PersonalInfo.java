package com.takima.backskeleton.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Entity
@Table(name = "personalinfo")
public class PersonalInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;

    public PersonalInfo() {
        // Constructeur par défaut
    }

    public PersonalInfo(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

}