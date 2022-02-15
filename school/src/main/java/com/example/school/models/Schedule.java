package com.example.school.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import static javax.persistence.FetchType.LAZY;

@Entity
public class Schedule extends SimpleModel{

    @Column(nullable = false)
    public Integer semester;

    @Column(nullable = false)
    public Integer year;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "lecturer_id", nullable = false)
    private Lecturer lecturer;

    public Lecturer lecturer(){
        return lecturer;
    }

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "course_id", nullable = false)
    private Course course;

    public Course course(){
        return course;
    }
}
