
public class Calculate {
	
	//method definition   (access_specifier  return_type method_name(parameters))
	//public,private,protect this are the access specifier for the method 
	public void display() {      //method return nothing
		System.out.println("Inside display method...");
	}
	
	public int add(int a,int b) {	//method return integer value 
		return a+b;
	}
	
	//method overloading 
		//method having same name but different number/type/sequence of parameter
		//return type does not matter for method overloading
	
	public int sub(int a, int b) {
		return a-b;
	}
	
	public int sub(int a,int b,int c) {
		return a-b-c;
	}
	
	public float sub(float a, int b,int c) {
		return a-b-c;
	}
	
	

}
