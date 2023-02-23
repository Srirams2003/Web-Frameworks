package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Student;
import com.example.demo.Service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService studserv;
	
	@PostMapping("/add")
	public Student addStudent(@RequestBody Student obj) {
		return studserv.addStudent(obj);
	}
	
	@GetMapping("/show")
	public List<Student> getStudents(){
		List<Student> arr = new ArrayList<>();
		arr = studserv.getAllStudents();
		return arr;
	}

}
