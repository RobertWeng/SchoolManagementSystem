package com.example.school.models;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import static javax.persistence.FetchType.LAZY;

@Entity
@Getter
public class Course extends SimpleModel{

    @Column(nullable = false)
    public String name;

    @Column(nullable = false)
    public Integer credits;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "department_id", nullable = false)
    private Department department;


}
