package com.nt.bo;

public class EmployeeBo {
 
	private Integer eno; //optional to take as criteria value
	private String ename;
	private String desg;
	private Float basicSalary;
	private Float grossSalary;
	private Float netSalary;
	
	//setter and getter method
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
	public void setGrossSalary(Float grossSalary) {
		this.grossSalary = grossSalary;
	}
	public void setNetSalary(Float netSalary) {
		this.netSalary = netSalary;
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
	public Float getGrossSalary() {
		return grossSalary;
	}
	public Float getNetSalary() {
		return netSalary;
	}
}
