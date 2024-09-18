package com.testing.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testing.Entity.Student;
import com.testing.repo.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	StudentRepo studentRepo;
	
	public Student save(Student student)
	{
		return studentRepo.save(student);
	}
	
	public List<Student> getAll()
	{
		return studentRepo.findAll();
	}
	

}
