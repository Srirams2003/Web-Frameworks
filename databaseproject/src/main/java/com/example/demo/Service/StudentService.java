package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Student;
import com.example.demo.Repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository repo;
	
	//adduser
	public Student addStudent(Student obj) {
		return repo.save(obj);
	}
	
	//getuser
	public List<Student> getAllStudents(){
		List<Student> result = new ArrayList<>();
		result = (List<Student>) repo.findAll();

		return result;
	}

}
