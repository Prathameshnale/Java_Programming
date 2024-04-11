
class Person {

	
	public void display() {
		System.out.println("inside display method of Person class");
		
	}

	public void show() {
		System.out.println("inside show method of Person class");
	}
	
}



public class Demo {

	public static void main(String[] args) {
		
		Person a1 = new Person() {
			
			public void display() {
				System.out.println("inside display of anonymous class");
			}	
			
		};
		
		a1.display();	
	}
	
}
