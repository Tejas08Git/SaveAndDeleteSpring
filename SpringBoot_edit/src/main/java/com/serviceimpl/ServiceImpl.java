package com.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daoi.DaoI;
import com.model.Student;
import com.servicei.ServiceI;
@Service
public class ServiceImpl implements ServiceI {

	@Autowired
	DaoI di;

	@Override
	public void savedata(Student s) {
		di.save(s);
		
	}

	@Override
	public Student getdata(String uname, String password) {
	 Student s = di.findAllByUnameAndPassword(uname, password);
		return s;
	}

	@Override
	public void delete(int sid) {
		di.deleteById(sid);
		
	}

	@Override
	public Student editdata(int sid) {
	Student s= di.findBySid(sid);
		return s;
	}



}
