package com.example.school.models;

import lombok.Getter;

import javax.persistence.*;

import static javax.persistence.FetchType.LAZY;

@Entity
@Getter
public class Lecturer extends SimpleModel{

    @Column(nullable = false)
    public String name;

    @Column(nullable = false)
    public Integer salary;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "department_id", nullable = false)
    private Department department;

}
