package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {


    @Autowired
    StudentRepository studentRepository;

    public Student saveStudent(Student student) {

        return studentRepository.save(student);


    }


    public List<Student> getAllStudents() {

        List<Student> students = studentRepository.findAll();
        return students;
    }

    public void delete(int id) {
        studentRepository.deleteById(id);
    }

    public void update(Student books) {
        studentRepository.save(books);
    }
}

