package com.israel.spring_boot_restapi.service;

import com.israel.spring_boot_restapi.entity.Student;
import com.israel.spring_boot_restapi.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public ResponseEntity<List<Student>> getStudents() {
        return new ResponseEntity<>(studentRepository.findAll(), HttpStatus.OK);
    }

    public ResponseEntity<Optional<Student>> getStudent(int id) {
        return new ResponseEntity<>(studentRepository.findById(id), HttpStatus.OK);
    }

    public ResponseEntity<Student> addStudent(Student student) {
        return new ResponseEntity<>(studentRepository.save(student),HttpStatus.OK);
    }
}
