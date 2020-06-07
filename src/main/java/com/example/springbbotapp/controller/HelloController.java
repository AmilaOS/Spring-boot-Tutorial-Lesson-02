package com.example.springbbotapp.controller;

import com.example.springbbotapp.modal.Student;
import com.example.springbbotapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    StudentService studentService;

    @RequestMapping("/hello")
    public String helloWorld(){
        return "Hello World!";
    }

    @RequestMapping("/saveaction")
    public String saveaction(){

        Student s = new Student();
        s.setId(2);
        s.setName("Amila2");
        s.setAddress("Bingiriya2");
        s.setAge(26);

        return  studentService.saveStudent(s);
    }

    @RequestMapping("/getAll")
    public List<Student> getAll(){
       return studentService.getAll();
    }
}
