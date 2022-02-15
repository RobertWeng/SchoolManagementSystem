package com.example.school.service;

import com.example.school.dao.StudentScheduleRepository;
import com.example.school.models.Schedule;
import com.example.school.models.StudentSchedule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class StudentScheduleService {

    @Autowired
    private StudentScheduleRepository repo;

    public List<StudentSchedule> findBySchedule(Schedule schedule){
        List<StudentSchedule> studentSchedule = repo.findBySchedule(schedule);
        return studentSchedule;
    }

    public void save(StudentSchedule studentSchedule) {
        repo.save(studentSchedule);
    }

}
