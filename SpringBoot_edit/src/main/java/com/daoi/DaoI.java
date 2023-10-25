package com.daoi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.model.Student;

@Repository
public interface DaoI extends JpaRepository<Student, Integer> 
{

	
	public Student findAllByUnameAndPassword(String uname,String password);
	
	public Student findBySid(int sid);
}
