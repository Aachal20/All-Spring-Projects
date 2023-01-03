package in.aachal.beans;

import org.springframework.stereotype.Component;

@Component("emp")
public class Employee {
 
	private int empno;
	private String ename;
	private float billAmt;
	
	public Employee(int empno, String ename, float billAmt) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.billAmt = billAmt;
	}
	
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", billAmt=" + billAmt + "]";
	}
}
