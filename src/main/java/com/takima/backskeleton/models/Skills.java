package com.takima.backskeleton.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Setter
@Getter
@Entity
@Table(name = "skills")
public class Skills {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "domains")
    private String domains;

    @Column(name = "details")
    private String details;

    public Skills() {
        // Constructeur par défaut
    }

    public Skills(String domains, String details) {
        this.domains = domains;
        this.details = details;
    }

}
