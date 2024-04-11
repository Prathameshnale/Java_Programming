
interface Person{
	void display(String name);
}


public class Demo {

	public static void main(String[] args) {
		
		
		Person p1 = (name)->{
			System.out.println("Lamda expression 1 "+name);
		};
		p1.display("prathamesh");
		
		
		Person p2 = (name)->{System.out.println("lamda expression 2 "+name);};
		p2.display("Digvijay");
		
		
		Person p3 = (name)->System.out.println("lamda expression 3 "+name);
		p3.display("Swapnil");

	}

}
