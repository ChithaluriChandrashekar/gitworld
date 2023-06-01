package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/studentdemo")
public class StudentController {

	@Autowired
	StudentService ss;

	
	@PostMapping("/savedata")
	public Student saveStudent(@RequestBody Student student) {
		return ss.saveStudent(student);
	}

}
