package com.Spring_restapi_project.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Spring_restapi_project.demo.model.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
         
}
