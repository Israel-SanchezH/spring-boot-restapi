package com.israel.spring_boot_restapi.controller;

import com.israel.spring_boot_restapi.entity.Student;
import com.israel.spring_boot_restapi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/institution")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public ResponseEntity<List<Student>> getStudents(){
        return studentService.getStudents();
    }

    @GetMapping("/students/{id}")
    public ResponseEntity<Optional<Student>> getStudent(@PathVariable int id){
        return studentService.getStudent(id);
    }

}
