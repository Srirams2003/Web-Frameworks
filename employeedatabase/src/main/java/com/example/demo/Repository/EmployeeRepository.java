package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.employee;

public interface EmployeeRepository extends JpaRepository<employee, Integer> {

}
