package com.example.school.service;

import com.example.school.dao.StudentRepository;
import com.example.school.models.Schedule;
import com.example.school.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class StudentService {

    @Autowired
    private StudentRepository repo;

    public List<Student> listAll(Schedule schedule) {
        return repo.findAllBySchedule(schedule);
    }

}
