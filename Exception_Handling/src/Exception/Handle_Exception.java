package Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Handle_Exception {
	
	public static void display(String param) {
		
		//FileReader reader = new FileReader("file.text"); 
		
		//above line shows error because we not handle exception with try catch in case file.text is not found
		//so we need to handle like below with try catch
		
		try {
			FileReader reader = new FileReader("file.text");
		} catch (FileNotFoundException ex) {
			//ex.printStackTrace(); 
			System.out.println("File does not exists..");  //user friendly message
		}
		
		//multiple catch block
		
		try {
			FileReader reader = new FileReader("file.text");
			int value = reader.read();  //we need to handle IOException here in case file is empty
		} catch (FileNotFoundException ex) {
			//ex.printStackTrace(); 
			System.out.println("File does not exists..");  //user friendly message
		}catch (IOException ex) {
			ex.printStackTrace();
		}  //we can have any number of catch block
		
		//FileNotFoundException class extends IOException class so in we cannot write IOException in first catch and 
		//FileNotFoundException in second catch if we want to write IOException in first catch then we don't need to
		//write second catch for FileNotFoundException Exception cause IOException class extended by FileNotFoundException class

		
		//finally
		FileReader reader = null;
		try {
			reader = new FileReader("file.text");
			int value = reader.read();  
			reader.close();    //if above line gives exception then this line never get executed so we can't close connection 
								//which is imp. so here we use finally block to close connection
		} catch (FileNotFoundException ex) {
			//ex.printStackTrace(); 
			System.out.println("File does not exists..");  
		}catch (IOException ex) {
		 	ex.printStackTrace();
		}finally {
			if(reader!=null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}				
			}
		}
		
		//finally block always gets executed at the end it does'nt matter Exception occurs or not 
		//so this is how we can handle code in finally block;
	
		
	}

}
