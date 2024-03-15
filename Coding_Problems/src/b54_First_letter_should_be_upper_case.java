import java.util.Scanner;

public class b54_First_letter_should_be_upper_case {

	public static void main(String[] args) {
		// Write a program to display STRING INITCAP of Words?
		//input : pramod reddy pavan chandu
		//output: Pramod Reddy Pavan Chandu
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String str=sc.nextLine();
		
		String newStr="";
		String finalStr="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch!=32) {
				if(newStr.length()==0) {
					if(ch>=97 && ch<=122) {
						ch=(char) (ch-32);
					}
				}
				newStr=newStr+ch;
			}else {
				finalStr=finalStr+" "+newStr;
				newStr="";	
			}
		}
		finalStr=finalStr+" "+newStr;
		
		System.out.println("String = "+finalStr);

	}

}
