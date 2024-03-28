




	interface Parent{
		
		int a=5;
		
		default void display() {
			System.out.println("inside default method of interface");
		}
		
		static void abc() {
			System.out.println("inside statid method of interface");
		}
		
		void show();
	}
	
	
	class Child implements Parent{

		@Override
		public void show() {
			
			System.out.println("inside show method");
		}
		
		@Override
		public void display() {
			System.out.println("inside default method of interface 5");
		}

	}


public class demo {

	public static void main(String[] args) {
		
		Parent p = new Child();
		p.show();      //calling 
		p.display();  //calling default method using object.
		Parent.abc();  //calling static method of interface using interface name.
	}

}
