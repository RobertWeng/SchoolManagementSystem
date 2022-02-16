package com.example.school.dao;

import com.example.school.models.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {

    @Query("SELECT o FROM Schedule o WHERE o.lecturer.department <> o.course.department ORDER BY o.lecturer.name ASC")
    List<Schedule> findAllByCourseAndLecturer();

    @Query("SELECT o FROM Schedule o ORDER BY o.year ASC")
    List<Schedule> findAll();

    @Query("SELECT o FROM Schedule o WHERE o.id = :id")
    Schedule findById(@Param("id") Integer id);
}
