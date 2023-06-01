package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentDao;
import com.example.demo.model.Student;

@Service
public class StudentService {

	
	@Autowired
	StudentDao sd;
	
	public Student saveStudent(Student student)
	{
		return sd.saveStudent(student);
	}

}
