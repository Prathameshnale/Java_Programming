


class Person{

	public static void display() {
		System.out.println("Display of Person");
	}
}


class Employee extends Person{

	public static void display() {
		System.out.println("Display of employee");
	}
}


public class Demo1 {

	public static void main(String[] args) {
			Person p1 = new Person();
			Person p2 = new Employee();
			
			p1.display();
			p2.display();
	}
}
