package com.takima.backskeleton.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Personal_info")
@Getter
public class PersonalInfo {
    @Column(name="item")
    private String item;
    @Column(name = "info")
    private String info;
    @Id
    private Long id;

    private PersonalInfo(Builder builder) {
        this.id=builder.getId();
        this.item=builder.getItem();
        this.info=builder.getInfo();
    }

    public PersonalInfo() {

    }

    @Getter
    public static class Builder {
        private Long id;
        private String item;
        private String info;

        public Builder id(Long id) {
            this.id=id; return this;
        }

        public Builder item(String item) {
            this.item=item; return this;
        }

        public Builder info(String info) {
            this.info=info; return this;
        }

        public PersonalInfo build() {
            return new PersonalInfo(this);
        }
    }
}
