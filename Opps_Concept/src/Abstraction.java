
public class Abstraction {

	public static void main(String[] args) {
		

	}

}


	/*
		Abstraction - Hiding implementation details from user and showing only essential data/functionality to the user
		              is called abstraction.
		              
		In java Abstraction can be achieved in two ways
		1. by making class Abstract and
		2. by making use of Interface.
		
		1.Abstract Class
		
		abstract class Animal   //abstract class
		{
			abstract void walk();    //abstract method  (now this method should be present in all the child classes of Animal)
			public void eat();
		}
		
		class hours extends Animal
		{
			public void walk()
			{
				system.out.println("on 4 legs");
			}
		}
		
		
		class humans extends Animal
		{
			public void walk()
			{
				system.out.println("on 2 legs");
			}
		}
		           
		              
		             
	public class Abstraction {

	public static void main(String[] args) 
	{
		hourse h = new hours ();
		h.walk();
		
		humans hn = new humnas();
		hn.walk();
		
		Animal a = new Animal();   //not allowed, we cannot make a object of abstract class
		a.walk();
	}
	}       
		              
		              
        Properties of Abstract class/method
        
        - we cannot create object of abstract class, but can make a reference of abstract class which can be help to pointing
        	to the other class object.
        - if we write abstract with the class then it is a abstract class
        - if we write abstract with method then automatically that class and that method is a abstract
        - we cannot write the definition of abstract method inside abstract class, only declaration should be there but
          we can define the other method i.e non abstraction method with implementation inside abstract class.
        - if we make any abstract method inside abstract class then , that method should present all the child classes of that 
        	abstract class may be definition of the method is change but declaration should be same
		- we cannot declare abstract constructor and abstract static method.  
		- we can have constructor in abstract class and it's parents class ,if we called constructor in child class then
			automatically parent class constructor gets invoke first and then child constructor invoke.
		
		           
		           
		           
		           
		2. Interface 
		
		    need of interface - we cannot inherit more than one parent class but in case if it is required then
		    					can make interface and then inherit/implement the interface 
		    					we can inherit multiple interface in java using implements keyword
		    					By using interface we achieve the multiple inheritance in java
		    					
		   properties of interface -
		    		
		    		-interface can have only declaration of the methods, syntax -> return type method name (parameters with data type)
		    			i.e interface can have only abstract methods and constant variables.
		    			e.g void addnewEmployee(int ch);
		    		-all the variables used in interface are considered as a constant/final.
		    		- all the variables /fields are by default public static final in interface 
		    			e.g int a=2;  then it is bydefault public,static,final.
		    		-definition of each method declared inside interface should be present inside implemented interface class
		    		- one interface can extends another multiple interfaces separated by (,) and in sub-interfaces definition
		    		 of super-interfaces method is not compulsory.
		    		- interface cannot extends any class. 
		    		- interface cannot have constructor
		           
*/