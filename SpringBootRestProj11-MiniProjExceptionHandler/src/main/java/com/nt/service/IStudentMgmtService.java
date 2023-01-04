package com.nt.service;

import java.util.List;

import com.nt.entity.Student;
import com.nt.exception.StudentNotFoundException;

public interface IStudentMgmtService {
  
	public String saveStudent(Student st);
	public List<Student> findAllStudent();
	public Student findStudentById(Integer sId);
	public String updateStudent(Student stud);
	public String deleteStudentById(Integer sId)throws StudentNotFoundException;
}
