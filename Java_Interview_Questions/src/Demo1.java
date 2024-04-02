


class Person{
	//final int a1;  //not allowed
	
	final int a=5;
	
	//a=10;    //not allowed
	
	public void info() {
		System.out.println("Inside info method of Person class");
	}	
}


public class Demo1 {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.info();			
	}
}
