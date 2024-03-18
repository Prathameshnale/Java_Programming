import java.util.Scanner;

public class b57_Conversion_String_number_to_int_number {

	public static void main(String[] args) {
		// Write a program to convert Integer of String type to INTEGER type
		//without using parse int?
		
		//e.g input = 54875 (i.e String str=54875) 
		//    ouput = 54875  (i.e int a=54875)
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		String num=sc.nextLine();
		boolean status=false;
		
		for(int i=0;i<num.length();i++) {
			char c=num.charAt(i);
			if(!(c>=48 && c<=57)) {
				System.out.println("String is not Valid...");
				break;
			}
			status=true;
		}
		
		if(status) {
			int number=0;
			for(int i=0;i<num.length();i++) {
				int a=(num.charAt(i)-48);
				number=(number*10)+a;
			}
			
			System.out.println("Number = "+number);
		}
	}

}
