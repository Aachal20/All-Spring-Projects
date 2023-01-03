package in.aachal.beans;

/*
1. Eager initialization
In eager initialization, the instance of Singleton Class is created at the time of class loading,
this is the easiest method to create a singleton class but it has a drawback that
instance is created even though client application might not be using it. 

*/

//

public class Printer {
	
//private static current class varible
	private static Printer INSTANCE;
	
	private Printer(){
		System.out.println("printer ::::: 0-param constructor");
	}
	
	
	//static factory method
	public static Printer getInstance() {
		if(INSTANCE==null)
			INSTANCE = new Printer();
		return INSTANCE;
	}
	
	}	



/*public class Printer {

	private static Printer INSTANCE;

	public Printer() {
		System.out.println("printer ::::: 0-param constructor");
	}

	

	static {
		try {
			INSTANCE = new Printer();
		} catch (Exception e) {
			throw new RuntimeException("Exception occured in creating singleton instance");
		}
	}

	public static Printer getInstance() {

		return INSTANCE;
	}
}*/


//both ex work good in single thered but give problem in MT
//The easier way to create a thread-safe singleton class is to make the global access method synchronized, so that only one thread can execute this method at a time. General implementation of this approach is like the below class.


/*ublic class Printer {

	private static Printer INSTANCE;

	public Printer() {
		System.out.println("printer ::::: 0-param constructor");
	}
	
	public static Printer getInstance() {
		if(INSTANCE==null)
			INSTANCE = new Printer();
		return INSTANCE;
	}
	

	
}*/
