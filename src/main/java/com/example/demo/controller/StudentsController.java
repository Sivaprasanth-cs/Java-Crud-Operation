package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentsController {
    @Autowired
    StudentService studentService;


    @PostMapping("/students/save")
    private Student saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @GetMapping("/students/getAll")
    private List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @DeleteMapping("/students/delete/{id}")
    private ResponseEntity<String> deleteStudent(@PathVariable("id") int id) {

        studentService.delete(id);
        return ResponseEntity.ok("Deleted Successfully");
    }

    @PutMapping("/students/update")
    private Student update(@RequestBody Student student) {
        studentService.update(student);
        return student;
    }
}
