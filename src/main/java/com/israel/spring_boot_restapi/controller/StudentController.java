package com.israel.spring_boot_restapi.controller;

import com.israel.spring_boot_restapi.entity.Student;
import com.israel.spring_boot_restapi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/students")
    public ResponseEntity<Student> addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @PutMapping("/students")
    public ResponseEntity<Student> updateStudent(@RequestBody Student student){
        return studentService.updateStudent(student);
    }

}
