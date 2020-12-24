package com.Spring_restapi_project.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring_restapi_project.demo.model.Student;
import com.Spring_restapi_project.demo.repository.StudentRepository;
@Service
public class StudentServiceImp implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Override
	public void AddStudent(Student student) {
		studentRepository.save(student);
		
	}

	@Override
	public Student findById(Long id) {
	  return studentRepository.findById(id).get();
	}




	

 
}
