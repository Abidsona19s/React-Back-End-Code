package com.testing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testing.Entity.Student;
import com.testing.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@PostMapping("/")
	public Student save(@RequestBody Student student)
	{
		return studentService.save(student);
	}
	@GetMapping("/all")
	public List<Student> getAll()
	{
		return studentService.getAll();
	}

}
