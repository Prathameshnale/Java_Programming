


public class AboutClass_Object {
	
	public static void main(String args[]) {
		
		Person p1 = new Person();   //this is how we can create a object , object is reference type
		p1.show(); 		//here we not passes any parameter while creating object so default constructor will get call
		
		
		Person p2 = new Person("Prathamesh",25,"Male");	//here we pass parameters so paramet. constructor get call
		p2.show();    
		 
	}

}
