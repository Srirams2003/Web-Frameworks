package com.example.StudentExample.Sevice;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.StudentExample.Entity.StudentEntity;
import com.example.StudentExample.Repository.StudentRepo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.Param;

@Service
public class StudentService 

{
	@Autowired
	StudentRepo stRepo;
	
	public StudentEntity saveDetails(StudentEntity e)
	{
		return stRepo.save(e);
	}
	
	public List<StudentEntity> getDetails()
	{
		/* int pageNo = 0;
        int pageSize = 1;
        
        Pageable pageable = PageRequest.of(pageNo, pageSize);        
        Page<StudentEntity> page = stRepo.findAll(pageable);
        
        List<StudentEntity> products = page.getContent();

        products.forEach((p) ->{
            System.out.println(p.toString());
        });
        
        return products;
		//return stRepo.findAll(); */
		
		String sortBy = "sname";
        String sortDir = "asc";
        
		Sort sort = sortDir.equalsIgnoreCase(Sort.Direction.ASC.name())?
                Sort.by(sortBy).ascending(): Sort.by(sortBy).descending();

        List<StudentEntity> products = stRepo.findAll(sort);
        return products;
        
	}
	
	public StudentEntity updateDetails(StudentEntity e1)
	
	{
		return stRepo.saveAndFlush(e1);
	}
	
	public void deleteDetails(int id)
	{
		stRepo.deleteById(id);
	}
	
	public List<StudentEntity> getUserInfo()
	{
		return stRepo.getAllStudent();
	}
	
	public List<StudentEntity> getparticularStudent(int sid)
	{
		return stRepo.getspecifiedStudent(sid);
	}
	
	public List<StudentEntity> getStudentBy(int sid,String sname)
	{
		return stRepo.getStudentbyIdName(sid, sname);
	}
	
	
	

	public Integer deleteById(int sid)
	{
	  return  stRepo.deleteByStudyId(sid);
	}
	
	public Integer updateById(String sname, int sid) {
		
		return stRepo.updateById(sname, sid);
	}
}



