package com.nt.controller;

import org.springframework.stereotype.Controller;

import com.nt.dto.EmployeeDto;
import com.nt.service.IEmployeeMgmtService;
import com.nt.vo.EmployeeVo;

@Controller("controller")
public class MainController {

	//HAS-A property
	private IEmployeeMgmtService service;

	public MainController(IEmployeeMgmtService service) {
		super();
		this.service = service;
		System.out.println("MainController.MainController()");
	}
	
	public String processEmployee(EmployeeVo vo) {
		System.out.println("MainController.processEmployee()");
		//convert employeeVo class obj to EmployeeDTO 
		EmployeeDto dto = new EmployeeDto();
		dto.setEname(vo.getEname());
		dto.setDesg(vo.getDesg());
		dto.setBasicSalary(Float.parseFloat(vo.getBasicSalary()));
		
		//use service
		return service.registerEmployee(dto);
		
	}//method
}//class
