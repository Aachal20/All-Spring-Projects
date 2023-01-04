package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Student;
import com.nt.exception.StudentNotFoundException;
import com.nt.repository.IStudentRepository;

@Service
public class StudentMgmtServiceImpl implements IStudentMgmtService {

	@Autowired
	private IStudentRepository studRepo;
	
	@Override
	public String saveStudent(Student st) {
	int idVal = studRepo.save(st).getSid();
		return "Student is registered having the Id value"+idVal;
	}

	@Override
	public List<Student> findAllStudent() {
		List<Student> list = studRepo.findAll();
		return list;
	}

	@Override
	public Student findStudentById(Integer sId) {
		return studRepo.findById(sId).orElseThrow(()-> new IllegalArgumentException("Student Not found"));
}

	@Override
	public String updateStudent(Student stud) {
	Student student = studRepo.save(stud);
		return "Student Data is Updated";
	}

	@Override
	public String deleteStudentById(Integer sId) throws StudentNotFoundException {
      System.out.println("StudentMgmtServiceImpl.deleteStudentById()");
      try {
    	  Optional<Student> optional = studRepo.findById(sId);
    	  if(optional.isPresent()) {
    		  Student student = optional.get();
    		studRepo.delete(student);
    		return "Student is Deleted" +sId;
    	  }
    	  else {
    		  throw new StudentNotFoundException("Student Not found with this Id");
    	  }
      }
      catch(Exception e) {
    	  e.printStackTrace();
    	  throw new StudentNotFoundException("Student Not found");
      }
	
	}

}
