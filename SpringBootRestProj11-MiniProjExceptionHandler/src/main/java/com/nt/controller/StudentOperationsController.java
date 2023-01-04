package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.entity.Student;
import com.nt.exception.StudentNotFoundException;
import com.nt.service.StudentMgmtServiceImpl;
@RestController
@RequestMapping("student")
public class StudentOperationsController {

	@Autowired
	private StudentMgmtServiceImpl service;
	
	@PostMapping("/register")
	public String registerStudent(@RequestBody Student stud) throws Exception {
		System.out.println("StudentOperationsController.addStudent()");
		service.saveStudent(stud);
		return "Successfully saved student";
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<?> getAllStudent() {
		System.out.println("StudentOperationsController.getAllStudent()");
		try {
			List<Student> allStudentList = service.findAllStudent();
			return new ResponseEntity<List<Student>>(allStudentList,HttpStatus.OK);
		}
		catch(Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>("Problem in fetching Student" ,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	@GetMapping("/getById/{sno}")
	public ResponseEntity<?>  findStudById(@PathVariable("sno") Integer sId) throws Exception{
		System.out.println("StudentOperationsController.getStudentById()");
	
			Student stud = service.findStudentById(sId);
			return new ResponseEntity<Student>(stud,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	
	
	@PostMapping("/update")
	public ResponseEntity<String> updateStudent(@RequestBody Student stud) throws Exception {
		System.out.println("StudentOperationsController.updateStudent()");
		try {
			String saveStudent = service.updateStudent(stud);
			return new ResponseEntity<String>(saveStudent ,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		catch(Exception e) {
		e.printStackTrace();
		return new ResponseEntity<String>(e.getMessage() ,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	
	}
	
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable("id") Integer sid) throws Exception {
		System.out.println("StudentOperationsController.deleteStudent()");
		
			String student = service.deleteStudentById(sid);
			return new ResponseEntity<String>(student ,HttpStatus.INTERNAL_SERVER_ERROR);
	
	}
}
