package com.nt.service;

import com.nt.bo.EmployeeBo;
import com.nt.dao.IEmployeeDAO;
import com.nt.dto.EmployeeDto;

public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {

	//Has-A Mapping (DAO)
	private IEmployeeDAO dao;
	private String osName;
	private String path;


	public EmployeeMgmtServiceImpl(IEmployeeDAO dao) {
		super();
		this.dao = dao;
		System.out.println("EmployeeMgmtServiceImpl.EmployeeMgmtServiceImpl()");
	}
	@Override
	public String registerEmployee(EmployeeDto dto) {
		System.out.println("EmployeeMgmtServiceImpl.registerEmployee() OS name :"+osName+ " path" +path);
		//Write b.logic to calculate grossSalary and netSalary
		float grossSalary = dto.getBasicSalary()+dto.getBasicSalary()*0.4f;   //+40 % 
		float netSalary = grossSalary-dto.getBasicSalary()*0.25f;

		//Prepare EmployeeBO class object having persistable data
		EmployeeBo bo = new EmployeeBo();
		bo.setEname(dto.getEname());
		bo.setDesg(dto.getDesg());
		bo.setBasicSalary(dto.getBasicSalary());
		bo.setGrossSalary(grossSalary);
		bo.setNetSalary(netSalary);

		System.out.println(dto.getDesg());
		//use DAO
		int result =  dao.insertEmployee(bo);

		//generate final result


		return result==1?"Employee registered with netSalary :" +netSalary :" Employee not registered with netSalary ::" +netSalary;

	}
	public void setPath(String path) {
		this.path = path;
	}
	
	public void setOsName(String osName) {
		this.osName = osName;
	}

	
}
