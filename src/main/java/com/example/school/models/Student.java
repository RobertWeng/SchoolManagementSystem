package com.example.school.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class Student extends SimpleModel{

    @Column(nullable = false)
    public String name;
}
