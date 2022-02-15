package com.example.school.dao;

import com.example.school.models.Schedule;
import com.example.school.models.StudentSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentScheduleRepository extends JpaRepository<StudentSchedule, Long> {

    @Query("SELECT o FROM StudentSchedule o WHERE o.schedule = :schedule")
    List<StudentSchedule> findBySchedule(@Param("schedule") Schedule schedule);
}
