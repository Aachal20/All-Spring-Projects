package in.aachal.beans;

import org.springframework.stereotype.Component;

@Component("b1")
public class B {
	private A a;
	
	public B() {
		System.out.println("B.B()::0-param constructor");
	}

	public void setA(A a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "B [a=" + a + "]";
	}

	
}
