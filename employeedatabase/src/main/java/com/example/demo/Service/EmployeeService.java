package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.employee;
import com.example.demo.Repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository repo;
	
	//adduser
	public employee addemployee(employee obj)
	{
		return repo.save(obj);
	}
	
	//getuser
	public List<employee> getAllemployee()
	{
		
		return repo.findAll();
		 
	}

}
