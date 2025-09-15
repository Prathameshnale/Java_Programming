import java.util.Scanner;

class Animal{
	String name;
	double weight;
	
	public void walk() {
		
	}	
}


class Dog extends Animal{
	public void eat() {
		System.out.println("eat chiken");
	}
}

class Tiger extends Animal{
	public void eat() {
		System.out.println("eat Meat");
	}
}



class demo{
	public static void main(String[] args) {
		//Animal a1=new Dog();
		
		//((Dog) a1).eat();	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check it is palindrome or not");
		String name = sc.nextLine();
		String newName = "";
		
		for(int i=(name.length()-1); i>=0; i--) {
			newName = newName+name.charAt(i);
		}
		
		System.out.println("newString = "+newName);
	
	}
}






