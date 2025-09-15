package Exception;

public class Main {

	public static void main(String[] args) {

	//ExceptionDemo.show();
	
	Handle_Exception.display("abc");
		
	}

}  

/*
 
 	There are three types of exception in java
 	1. Checked   -  Exception occurs while compile time called checked exceptions					
 	
 	2. Unchecked  - Exception occurs while runtime called unchecked exceptions
 					e.g - NullPointerException,ArithmeticException,IndexOutOfBoundException,IllegalArgumentException
 					
 	3. error - the exception which in not either checked or unchecked.
 			e.g - if memory not enough then this type of errors occur.
 			
 			
 			
 			Hierarchy of exception class
 				
 					    Throwable
 			   | 					  	   |
 		Exception(checked)				 Error
 			   |
 		RunTimeException(unchecked)
 			
 			
 			
 			
 
 */
