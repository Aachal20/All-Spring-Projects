package com.nt.dto;

import java.io.Serializable;

public class EmployeeDto implements Serializable {
	
	private Integer eno; //optional to take as criteria value
	private String ename;
	private String desg;
	private Float basicSalary;
	
	public void setEno(Integer eno) {
		this.eno = eno;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public void setBasicSalary(Float basicSalary) {
		this.basicSalary = basicSalary;
	}
	public Integer getEno() {
		return eno;
	}
	public String getEname() {
		return ename;
	}
	public String getDesg() {
		return desg;
	}
	public Float getBasicSalary() {
		return basicSalary;
	}
}
