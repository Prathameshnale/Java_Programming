import java.util.Scanner;
class demo{
	
	class Person{
		String name;
		String email;
		
		Person(){
			System.out.println("inside default of Parent");
		}
		
		Person(String name,String email){
			System.out.println("inside para constructor");
		}
		
		
	}
	
	
	class Employee extends Person{
		
		int id;
		double salary;
		
		Employee(){
			System.out.println("inside default of Employee");
		}
		
		Employee(double salary){
			System.out.println("inside para of Employee");
		}
		
		
		Employee(int id,double salary,String name,String email){
			
			this(salary);
		
			
		}
		
		
	}
	
	
	
	public static void main(String [] args) {
		
		
		
	}
	
}