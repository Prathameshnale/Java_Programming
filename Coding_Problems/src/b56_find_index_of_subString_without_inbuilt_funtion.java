import java.util.Scanner;

public class b56_find_index_of_subString_without_inbuilt_funtion {

	public static void main(String[] args) {
		// Write a program to find a SUB‐STRING without using INBUILT functions?
		//main String  : PrathameshNale
		//sub String   : Nale
		
		//output   : 1 times Nale present between 10 and 14 indexs.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Main String");
		String mainStr=sc.nextLine();
		System.out.println("Enter Sub-String");
		String subStr=sc.nextLine();
		
		char ch=subStr.charAt(0);
		for(int i=0;i<mainStr.length();i++) {
			char c=mainStr.charAt(i);
			
			if(c==ch) {
				for(int j=0;j<subStr.length();j++) {
					
				}
			}
			
		}
		
		

	}

}
