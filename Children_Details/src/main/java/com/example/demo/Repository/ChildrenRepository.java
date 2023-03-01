package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Entity.Children;

public interface ChildrenRepository extends JpaRepository<Children,Integer>{

	@Query("FROM Children where baby_id=2") 
	List<Children> findAll();
}
