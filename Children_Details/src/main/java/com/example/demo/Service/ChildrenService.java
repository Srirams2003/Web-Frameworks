package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Children;
import com.example.demo.Repository.ChildrenRepository;

@Service
public class ChildrenService {
	
	@Autowired
	
	private ChildrenRepository repo;
	
	public Children addChild(Children obj)
	{
		return repo.save(obj);
	}
	
	public List<Children> getAllChild()
	{
		Pageable p=PageRequest.of(0, 1);
		Page<Children> c=repo.findAll(p);
		return c.toList();
		
	}
	
	public List<Children> getAllChildren()
	{
		
		
		List<Children> c =repo.findAll(Sort.by(Sort.Direction.DESC, "baby_id"));
		
		return c;
	}
	
	public String delete(int baby_id) {
		repo.deleteById(baby_id);
		return"deleted";
	}

	public Children update(int baby_id,Children obj) {
		return repo.saveAndFlush(obj);
	}
	
	public List<Children> q()
	{
		//Pageable p=PageRequest.of(0, 1);
		
		List<Children> c =repo.findAll();
		
		return c;
	}

	

}
