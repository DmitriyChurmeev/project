package com.custom.project.model.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "name")
    private String name;
}
