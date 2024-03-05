package com.takima.backskeleton.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "contact")
public class Contact {
    @Id
    private Long id;
    @Column(name = "type")
    private String type;
    @Column(name = "info")
    private String info;

    public Contact(Long id, String type, String info) {
        this.id=id; this.type=type; this.info=info;
    }

    public Contact(){}
}
