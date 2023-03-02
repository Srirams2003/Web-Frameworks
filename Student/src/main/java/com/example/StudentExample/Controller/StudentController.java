package com.example.StudentExample.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.StudentExample.Entity.StudentEntity;
import com.example.StudentExample.Repository.StudentRepo;
import com.example.StudentExample.Sevice.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentRepo stRepo;
	
	@Autowired
	StudentService stuService;
	
	@PostMapping("/addDetails")
	public StudentEntity addInfo(@RequestBody StudentEntity st)
	{
		return stuService.saveDetails(st);
	}
	
	@GetMapping("showDetails")
	public List<StudentEntity> fetchDetails()
	{
		return stuService.getDetails();
	}
	@PutMapping("/updateDetails")
	public StudentEntity updateInfo(@RequestBody StudentEntity st1)
	{
		return stuService.updateDetails(st1);
	}
	
	
	@DeleteMapping("/delete/{sid}")
	public String deleteInfo(@PathVariable("sid") int sid)
	{
		stuService.deleteDetails(sid);
		return "Deleted details";
		
	}
	
	@GetMapping("home")
	public String get(@RequestParam String name)
	{
		return "hi "+name;
	}
	
	@GetMapping("showStudent")
	public List<StudentEntity> StudentDetails()
	{
		return stuService.getUserInfo();
	}
	@GetMapping("showSpecStudent/{sid}")
	public List<StudentEntity> SpecifiedtudentDetails(@PathVariable("sid") int sid)
	{
		return stuService.getparticularStudent(sid);
	}   
	
	@GetMapping("showStudentBy/{sid}/{sname}")
	public List<StudentEntity> StudentDetailsBy(@PathVariable("sid") int sid,@PathVariable("sname") String sname)
	{
		return stuService.getStudentBy(sid, sname);
	} 

	
	@DeleteMapping("/de/{sid}")
	public String deleteInfoStudent(@PathVariable("sid") int sid)
	{
	      return  stuService.deleteById(sid)+"  deleted";
	}
	@PutMapping("/updatedata/{sname}/{sid}")
	public String updateDataById(@PathVariable("sname") String username,@PathVariable("sid") int id) {
		return stuService.updateById(username, id)+" records has been updated";
	}
}
