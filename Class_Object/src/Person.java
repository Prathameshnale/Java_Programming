

public class Person {
	
	private String name; 	//this are the instance variable or field of class
	private int age;
	private String gender;
	
	
	public Person(){	//default constructor of class
		this.name="default_name_abc";
		this.age=00;
		this.gender="default_gender_male";
	}
	
	public Person(String name,int age,String gender) {	//this is parameterized constructor
		this.name=name;								// here "this" keyword is refers as current filed of class.
		this.age=age;
		this.gender=gender;
	}
	
	public void show() {			//this is method of class
		System.out.println("Inside show method of Person");
		System.out.println("Name : "+name+" age : "+age+" gender : "+gender);
	}
}
