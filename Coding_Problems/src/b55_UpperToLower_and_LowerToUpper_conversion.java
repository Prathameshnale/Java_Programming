import java.util.Scanner;

public class b55_UpperToLower_and_LowerToUpper_conversion {

	public static void main(String[] args) {
		// Write a program to convert UPPER CASE TO LOWER CASE & VICE VERSA?
		
		//input :PraMoD	ReddY GoPi RedDY
		//output:pRAmOd	rEDDy gOpI rEDdy
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		
		String newStr="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>=65 && ch<=90) {
				ch=(char)(ch+32);
			}else if(ch>=97 && ch<=122) {
				ch=(char)(ch-32);
			}else {
				ch=ch;
			}
			newStr=newStr+ch;
		}
		
		System.out.println("newStr = "+newStr);
	}

}
