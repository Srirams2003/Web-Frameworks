package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Children;
import com.example.demo.Service.ChildrenService;

@RestController

public class ChildrenController {
	
	@Autowired
	private ChildrenService childserv;
	
	@PostMapping("/add")
	
	public Children addChildren(@RequestBody Children obj)
	{
		return childserv.addChild(obj);
	}
	@GetMapping("/show")
	public List<Children>getchild(){
		List <Children>arr=new ArrayList<>();
		arr=childserv.getAllChildren();
		return arr;
	}
	
	@PutMapping("/update/{baby_id}")
	public Children update(@PathVariable int baby_id,@RequestBody Children obj) {
		return childserv.update(baby_id, obj);
	}
	
	@GetMapping("/abc")
	public List<Children>u(){
		List <Children>arr=new ArrayList<>();
		arr=childserv.q();
		return arr;
	
	}


}
