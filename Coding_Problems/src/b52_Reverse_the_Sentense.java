import java.util.Scanner;

public class b52_Reverse_the_Sentense {

	public static void main(String[] args) {
		// Write a program to REVERSE the SENTENCE?
		
		//e.g 
		//enter	the	sentence          :	rama and	laxmana	
		//The	reserve	sentence is   :	laxmana	and	rama
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentense");
		String str=sc.nextLine();
		
		String revStr="";
		String newStr="";
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(c!=32) {
				newStr=newStr+c;
			}else {
				revStr=newStr+" "+revStr;
				newStr="";
			}
		}
		revStr=newStr+" "+revStr;
		
		System.out.println("The reverse sentence is : "+revStr);

	}

}
