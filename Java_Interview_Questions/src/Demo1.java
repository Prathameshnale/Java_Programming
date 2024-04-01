


interface Person{
	public void walk();
	
	public static void run() {
		System.out.println("Can be Run on two legs");
	}
}

class Employee implements Person{

	@Override
	public void walk() {
		System.out.println("Can be walk");	
	}

}

public class Demo1 {

	public static void main(String[] args) {
		Person p = new Employee();
		p.walk();  //calling abstract method
		Person.run();  //calling static method with the help of interface Name.

	}
}
