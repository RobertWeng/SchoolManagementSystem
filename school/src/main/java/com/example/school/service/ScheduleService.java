package com.example.school.service;

import com.example.school.dao.ScheduleRepository;
import com.example.school.models.Schedule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ScheduleService {

    @Autowired
    private ScheduleRepository repo;

    public List<Schedule> listAll() {
        return repo.findAll();
    }

    public Schedule get(int id) {
        return repo.findById(id);
    }

    public List<Schedule> findAllByCourseAndLecturer(){
        List<Schedule> scheduleList = repo.findAllByCourseAndLecturer();
        return scheduleList;
    }
}
