package com.example.springbbotapp.repository;

import com.example.springbbotapp.modal.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
