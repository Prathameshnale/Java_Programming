import java.util.Scanner;

public class b48_Sum_of_number_from_alphanumeric_string {

	public static void main(String[] args) {
		// Write a program to find the sum of numbers in an ALPHA NUMERIC STRING?
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Alpha-Numeric String");
		String str=sc.nextLine();
		
		String numStr="";
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(c>=48 && c<=57) {
				numStr=numStr+c;
			}
		}
		//System.out.println("numStr = "+numStr);
		int sum=0;
		for(int i=0;i<numStr.length();i++) {
			int a=(numStr.charAt(i)-48);
			sum=sum+a;
		}
		
		System.out.println("Sum of alpha-numeric = "+sum);

	}

}
