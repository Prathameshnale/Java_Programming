import java.util.Scanner;

public class b46_Reverse_String {

	public static void main(String[] args) {
		// Write a program to display REVERSE of a STRING?
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String to reverse it");
		String str=sc.nextLine();
		
		
		System.out.println("Before Reverse = "+str);
		String newStr="";
		for(int i=(str.length()-1);i>=0;i--) {
			char c = str.charAt(i);
			newStr=newStr+c;
		}
		
		System.out.println("After Reverse = "+newStr);

	}

}
