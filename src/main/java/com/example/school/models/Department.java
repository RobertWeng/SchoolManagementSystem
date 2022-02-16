package com.example.school.models;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Department extends SimpleModel{

    @Column(nullable = false)
    private String name;
}
