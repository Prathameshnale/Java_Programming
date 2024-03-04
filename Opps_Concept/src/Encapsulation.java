
public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


/*
	Access Modifiers 
		
				package p
		
		
		
		class A
		{
			public x;    //public
			private y;   //private
			protected z; //protected
			int i;       //default
		
		}
		
		class B extends A
		{
		
		}
		
		class C
		{
		
		}
		
		
				package q
				import package p;
		
		class D extends A
		{
		
		}
		
		class E
		{
		
		}
		
		
		
		class          		 A			B			C			D			E		
		
		private(y)			yes         No          No 			NO          NO
		
		public (x)			yes			yes 		yes			yes			yes
		
		protected (z)		yes			yes			yes			yes   		No
		
		default (i)			yes			yes			yes			No  		No
		
		
		
		
		final is also a modifier
		
		final is used to make constant
		-final variable cannot be change/modify once it is initialized
		-final variable cannot be initialized at the time of declaration or inside the constructor only
		
		-class can also be a final and it cannot be extends
		-method can also be a final and it cannot be overridden
		
		
		
		Encapsulation  - Binding or Encapsulate data members and it's methods together inside a class is called as Encapsulation
		
		
		
*/