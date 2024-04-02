


class Person{
	private String name;
	public int id;
	
	public void info() {
		System.out.println("Inside info method of Person class");
	}	
	
	public void display() {
		System.out.println("name = "+name+" id = "+id);
	}
}

public class Demo1 {

	public static void main(String[] args) {
		Person p1 = new Person() {
			
			public void info() {
				System.out.println("Inside info method of Anonymous class");
			}
		};
		System.out.println();
		p1.info();
		p1.display();
	}
}
