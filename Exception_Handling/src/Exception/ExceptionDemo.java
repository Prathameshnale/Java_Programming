package Exception;

public class ExceptionDemo {
	
	public static void show () {
		System.out.println("show method invoked...");
		display(null);      //this line gives error at runtime (because syntax is correct but display method not accept null
	}
	
	
	public static void display(String param) {
		System.out.println("display method invoked.."+param.toUpperCase());
	}

}
