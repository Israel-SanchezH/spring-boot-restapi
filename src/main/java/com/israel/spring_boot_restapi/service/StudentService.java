package com.israel.spring_boot_restapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public ResponseEntity<List<Student>> getStudents() {
        return studentRepository.findAll();
    }

}
