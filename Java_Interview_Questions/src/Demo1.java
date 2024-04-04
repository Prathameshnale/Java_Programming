


class Person{
	
	private int pid;
	
	Person(){
		System.out.println("Inside Person constructor");
	}	
	
	{
		pid=8876;
		System.out.println("value of pid = "+pid);
	}
}


class Employee extends Person{

	Employee()
	{
		super();
		System.out.println("Inside Employee constructor");
	}
	
}

public class Demo1 {

	public static void main(String[] args) {
		Employee e1 = new Employee();	
	}
}
