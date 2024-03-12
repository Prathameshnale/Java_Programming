import java.util.Scanner;

public class b47_Count_no_of_character_in_String {

	public static void main(String[] args) {
		// Write a program to COUNT number of CHARACTERS in a String?
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String to count characters");
		String str=sc.nextLine();
		String str1=str;
		str=str.toUpperCase();
		
		
		String newStr="";
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(c>=65 && c<=90) {
				newStr=newStr+c;
			}
		}
		
		System.out.println("No of character in String = "+newStr.length());

	}

}
