package com.example.springbbotapp.service;

import com.example.springbbotapp.modal.Student;
import com.example.springbbotapp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public String saveStudent(Student student){
        try {
            studentRepository.save(student);
        }catch (Exception e){
            return "Error occured at saving "+e;
        }
        return "Saved Successfully!";
    }

    public List<Student> getAll() {
        return studentRepository.findAll();
    }
}
