package com.example.StudentExample.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.StudentExample.Entity.StudentEntity;

import jakarta.transaction.Transactional;

public interface StudentRepo extends JpaRepository<StudentEntity,Integer>{
	@Query(value="select * from student_entity ",nativeQuery=true)
	public List<StudentEntity> getAllStudent();
	
	@Query(value="select * from student_entity where sid=:s",nativeQuery=true)
	public List<StudentEntity> getspecifiedStudent(@Param("s") int sid);
	
	
	@Query(value="select * from student_entity where sid=:s or sname=:sn",nativeQuery=true)
	public List<StudentEntity> getStudentbyIdName(@Param("s") int sid,@Param("sn") String sname);
	


    @Modifying
    @Transactional
    @Query(value = "DELETE FROM student_entity where sid = :i", nativeQuery = true)
    Integer deleteByStudyId(@Param("i") int sid);
    
    @Transactional
	@Modifying
	@Query(value="UPDATE student_entity set sname=:sn WHERE sid=:i",nativeQuery=true)
	public Integer updateById(@Param("sn") String sname,@Param("i") int sid);
}
