package com.takima.backskeleton.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "certif")
@Getter
@Setter
public class Certif {
    @Id
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "domain")
    private String domain;

    public Certif() {

    }
}
