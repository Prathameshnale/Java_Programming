import java.util.Scanner;

public class b51_display_no_of_lowercase_uppercase_digit_specialS_space {

	public static void main(String[] args) {
		// Write a program to display number of LOWERCASE, UPPERCASE,
		//SPECIAL SYMBOLS, SPACES and DIGITS in a STRING?
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		
		int uc=0;
		int lc=0;
		int ss=0;
		int s=0;
		int d=0;
		
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(c>=65 && c<=90) {
				uc++;
			}else if(c>=97 && c<=122) {
				lc++;
			}else if(c>=48 && c<=57) {
				d++;
			}else if(c==32) {
				s++;
			}else {
				ss++;
			}
		}
		
		System.out.println("no. of LowerCase letters = "+lc);
		System.out.println("no. of UpperCase letters = "+uc);
		System.out.println("no. of Special Symbols = "+ss);
		System.out.println("no. of spaces = "+s);
		System.out.println("no. of Digits = "+d);
		

	}

}
