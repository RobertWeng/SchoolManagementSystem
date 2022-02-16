package com.example.school.controller;

import com.example.school.models.Schedule;
import com.example.school.models.Student;
import com.example.school.models.StudentSchedule;
import com.example.school.service.ScheduleService;
import com.example.school.service.StudentScheduleService;
import com.example.school.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@Controller
public class AppController {

    @Autowired
    private ScheduleService scheduleService;

    @Autowired
    private StudentService studentService;

    @Autowired
    private StudentScheduleService studentScheduleService;

    @RequestMapping("/")
    public String viewHomePage(Model model) {
        return "index";
    }

    @RequestMapping("/lecturer")
    public String viewLecturerPage(Model model) {
        List<Schedule> scheduleList = scheduleService.findAllByCourseAndLecturer();
//        HashMap<String, List<Schedule>> groupedList = new HashMap<>();
//        for (Schedule schedule: scheduleList){
//            String lecturerName = schedule.lecturer().name;
//            if (!groupedList.containsKey(lecturerName)){
//                groupedList.put(lecturerName, new ArrayList<>());
//            }
//            groupedList.get(lecturerName).add(schedule);
//        }
        model.addAttribute("scheduleList", scheduleList);
        return "lecturer";
    }

    @RequestMapping("/schedule")
    public String viewSchedulePage(Model model) {
        List<Schedule> scheduleList = scheduleService.listAll();
        model.addAttribute("scheduleList", scheduleList);
        return "schedule";
    }

    @RequestMapping("/schedule/{id}/enroll")
    public String viewSchedulePage(@PathVariable(name = "id") int id, Model model) {
        Schedule schedule = scheduleService.get(id);
        List<Student> studentList = studentService.listAll(schedule);
        model.addAttribute("studentList", studentList);
        model.addAttribute("student", new Student());
        model.addAttribute("scheduleID", id);
        return "enroll";
    }

    @RequestMapping("/schedule/{id}/view")
    public String viewScheduleViewPage(@PathVariable(name = "id") int id, Model model) {
        Schedule schedule = scheduleService.get(id);
        List<StudentSchedule> studentScheduleList = studentScheduleService.findBySchedule(schedule);
        model.addAttribute("studentScheduleList", studentScheduleList);
        return "schedule_view";
    }

    @RequestMapping(value = "/schedule/{id}/save", method = RequestMethod.POST)
    public String saveProduct(@PathVariable(name = "id") int id, @ModelAttribute("student") Student student) {
        if (student.id != 0) {
            StudentSchedule studentSchedule = new StudentSchedule();
            Schedule schedule = scheduleService.get(id);
            studentSchedule.withStudent(student);
            studentSchedule.withSchedule(schedule);
            studentScheduleService.save(studentSchedule);
        }
        return "redirect:/schedule";
    }
}
