import java.util.Scanner;

public class b45_String_palindrome_or_not {

	public static void main(String[] args) {
		// Write a program check the given string is PALINDROME or not?
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String to check palindrome or not");
		String str=sc.nextLine();
		str=str.toUpperCase();
		
		String newStr="";
		for(int i=(str.length()-1);i>=0;i--) {
			char c=str.charAt(i);
			newStr=newStr+c;
		}
		
		System.out.println("str = "+str+" newStr = "+newStr);
		if(str.equals(newStr)) {
			System.out.println("String is palindrome");
		}else
		{
			System.out.println("String is not palindome");
		}

	}

}
