package com.servicei;



import org.springframework.stereotype.Service;

import com.model.Student;

@Service
public interface ServiceI {

public void savedata(Student s);

public Student getdata(String uname, String password);

public void delete(int sid);

public Student editdata(int sid);





}
