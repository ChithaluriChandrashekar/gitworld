package com.example.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepo;

@Component
public class StudentDao {

	
	@Autowired
	StudentRepo sr;
	
	
	public Student saveStudent(Student student)
	{
		return sr.save(student);
	}
}
