package com.example.school.dao;

import com.example.school.models.Schedule;
import com.example.school.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    @Query("SELECT s FROM Student s JOIN StudentSchedule o on o.student = s JOIN Schedule z ON z = o.schedule AND NOT EXISTS(SELECT 1 FROM StudentSchedule WHERE student = s AND schedule = :schedule)")
    List<Student> findAllBySchedule(@Param("schedule") Schedule schedule);
}
