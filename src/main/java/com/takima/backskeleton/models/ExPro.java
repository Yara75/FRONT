package com.takima.backskeleton.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@Entity
@Table(name = "expro")
public class ExPro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nameC")
    private String nameC;

    @Column(name = "beginD")
    private Date beginD;

    @Column(name = "endD")
    private Date endD;

    @Column(name = "job")
    private String job;

    public ExPro()
    {
        // Constructeur par défaut
    }

    public ExPro(String nameC, Date beginD, Date endD, String job)
    {
        this.nameC = nameC;
        this.beginD = beginD;
        this.endD = endD;
        this.job = job;
    }
}
