
public class Polymorphism {

	public static void main(String[] args) 
	{
		
	}

}


/*
	Poly - many
	morphism - forms
	
	types of polymorphism
	1. compile time polymorphism /static polymorphism (method overloading)
	2. run time polymorphism (method overriding)
	
	method overloading -
	 			All methods should be present in single class having the same name and
	 			different number or sequence of parameters (return type may or may not be same) then
	 			it is called as method overloading
	 			
	method overriding -
	   			All methods should be present in both parent and child class (i.e in different class or inheritance)
	   			having the same name,same number and sequence as well as same return type then
	   			it is called as method overriding.
	   			
	
	compile time polymorphism / static polymorphism - 
				Which method (overloaded method) is called is decided by the compiler at compile time are
				called as compile time polymorphism.
				
				
			In static polymorphism the reference of class pointing to it's own object 
			i.e, student s1 = new Student();
			in this case the if we called any overloded method from class student with the help of s1
			then the compiler will decide which method is called and that is static polymorphism.
				
				
				
	run time polymorphism -
				which method (overrieded method) is called is decided by the JVM at the run time, then 
				it is called as run time polymorphism.
	
	
			In run time polymorphism the reference of class pointing to it's own object or pointing to it's
			child class object 
			i.e.
			1. Person p = new person();
			2. Person p1 = new teacher();            //here teacher is a child class of Person class   //upcasting
			3. teacher t = new Person();             //not possible  //not allowed
			4. ((person)teacher) t1 = new Person();  //allowed  //down casting
			
			in this case JVM will decide at run time which overrided method is to be called at run time and this is called as
			run time polymorphism
			
			e.g. 
			
			1. Person p = new person();   //this will call the overrided method of person class
			2. Person p1 = new teacher(); //this will call overrided method of teacher class
			3. teacher t = new Person();    //not allowed
			4. ((person)teacher) t1 = new Person();  //down casting  //this will call overrided method of person class
			
			//decision of calling of All above methods (1,2,4) are decided by the JVM at run time i.e. run time polymorphism
			 
			
			Parent reference can point to child class object but using that references if you want to call 
			child class method, you need to do explicit type casting.
			Example:
				Employee e1=new SalariedEmp();
				((SalariedEmp)e1).getBonus()		
	
*/