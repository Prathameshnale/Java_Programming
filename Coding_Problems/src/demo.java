



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
		Animal a1=new Dog();
		
		((Dog) a1).eat();	
	}
}






