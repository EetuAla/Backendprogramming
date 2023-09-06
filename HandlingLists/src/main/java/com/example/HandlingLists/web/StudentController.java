package com.example.HandlingLists.web;

import com.example.HandlingLists.domain.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {

    @GetMapping("/hello")
    public String hello(Model model) {
        List<Student> students = new ArrayList<>();

        Student student1 = new Student();
        student1.setFirstName("Eetu");
        student1.setLastName("Alanen");

        Student student2 = new Student();
        student2.setFirstName("Mikko");
        student2.setLastName("Mallikas");
        
        Student student3 = new Student();
        student3.setFirstName("Mari");
        student3.setLastName("Myyrä");

        students.add(student1);
        students.add(student2);
        students.add(student3);

        model.addAttribute("students", students);

        return "studentList";
    }
}



