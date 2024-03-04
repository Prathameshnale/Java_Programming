
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*
	Inheritance
	
	4 types of inheritance
	
		1.Single level Inheritance -
		
			e.g  
			 class Shape           //Base Class or Parent class
			 {																					parent class
			 	public void area()																	|
			 	{																				child class
			 	
			 	}
			 }
			 
			 class Triangle extends Shape  //Derived class or child class
			 {
			 	public void area()
			 	{
			 	
			 	}
			 }
			 
		2.Multilevel Inheritance -
		
			e.g  																			parent class (A)
			 class Shape           //Base Class or Parent class                                  |
			 {																				child class (B) of A
			 	public void area()                                                               |
			 	{																			child class of B
			 	
			 	}
			 }
			 
			 class Triangle extends Shape  //Derived class of Shape or child class of Shape or Parent class of EqulatralTriangle.
			 {
			 	public void area()
			 	{
			 	
			 	}
			 }
			 
			 
			 class EqulatralTriangle extends Triangle  //child class or Derived class
			 {
			 	public void area()
			 	{
			 	
			 	}
			 }
			 
			 
		3.Hierarchical Inheritance   - Inheritance in which one parent class having multiple child classes are hierarchical inheritance
		
			e.g 
			
			class Employee
			{
																			parent class A
			}														|				|				|
																child class B   child class C   child class D
			
			class SalariedEmployee extends Employee
			{
			
			}
			
			
			class ContractEmployee extends Employee
			{
			
			}
			
			
			
		4. Hybrid Inheritance     //Inheritance in which single level inheritance ,Multilevel Inheritance hierarchical inheritance
								    All inheritance contain are called as hybrid inheritance
		e.g 
																							   Parent class A
			class Shape           //Base Class or Parent class                             |    				|
			 {																	 child class (D) of A	child class (B) of A
			 	public void area()                                                            					|
			 	{																						child class of B
			 	
			 	}
			 }
			 
			 class Triangle extends Shape  //Derived class of Shape or child class of Shape or Parent class of EqulatralTriangle.
			 {
			 	public void area()
			 	{
			 	
			 	}
			 }
			 
			 
			 class Circle extends Shape  //child class of Shape
			 {
			 	public void area()
			 	{
			 	
			 	}
			 }
			 
			 
			 class EqulatralTriangle extends Triangle  //child class or Derived class
			 {
			 	public void area()
			 	{
			 	
			 	}
			 }
			 
			 
		5.Multiple Inheritance using Interface     - class having two parent class(class/interface) are called as multiple inheritance
			 
			 
			e.g
			
			 class A
			 {
			                                                                      class A			Interface B
			 }																		|  					|
			 																				class c
			 Interface B
			 {
			 
			 }
			 
			 
			 class C extends A implements B
			 {
			 
			 }
			 
*/
















