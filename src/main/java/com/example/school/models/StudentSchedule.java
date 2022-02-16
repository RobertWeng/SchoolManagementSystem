package com.example.school.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class StudentSchedule extends SimpleModel{

    @ManyToOne
    @JoinColumn(name = "student_id")
    public Student student;

    public StudentSchedule withStudent(Student student){
        this.student = student;
        return this;
    }

    @ManyToOne
    @JoinColumn(name = "schedule_id")
    public Schedule schedule;

    public StudentSchedule withSchedule(Schedule schedule){
        this.schedule = schedule;
        return this;
    }
}
