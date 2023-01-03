package in.aachal.beans;

import org.springframework.stereotype.Component;

@Component("a1")
public class A {
	private B b;
	
	public A() {
		// TODO Auto-generated constructor stub
		System.out.println("A.A()::0-param constructor");
	}

	public void setB(B b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "A [b=" + b + "]";
	}
}
