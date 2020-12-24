package com.Spring_restapi_project.demo.service;
import java.util.Optional;

import com.Spring_restapi_project.demo.model.Student;


public interface StudentService {
        void AddStudent(Student student);
        Student findById(Long id);
        
}
