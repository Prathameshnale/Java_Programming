


class Person{
	
	static int a=1;
	
	public void info() {
		System.out.println("Inside info method of Person class");
	}	
}

public class Demo1 {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.info();
		System.out.println("a = "+p1.a);
	}
}
