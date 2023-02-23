package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.employee;
import com.example.demo.Service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService empserv;
	
	@PostMapping("/addEmployee")
	public employee addemployee(@RequestBody employee obj)
	{
		return empserv.addemployee(obj);
	}
	@GetMapping("/show")
	public List<employee> getemployee(){
		List <employee> arr=new ArrayList<>();
		arr=empserv.getAllemployee();
		return arr;
	}

}
