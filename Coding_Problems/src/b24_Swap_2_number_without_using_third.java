

import java.util.Scanner;

public class b24_Swap_2_number_without_using_third {

	public static void main(String[] args) {
		// Write a program to Swap two numbers without using 3rd variable?
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two number");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		System.out.println("before swap num1 = "+num1+" num2 = "+num2);
		
//		num1=(num1+num2)- num1;
//		num2=(num1+num2)- num1;
		
		num1  = num1+num2;
		num2 = num1-num2;
		num1 = num1-num2;
		
		System.out.println("After swap num1 = "+num1+" num2 = "+num2);

	}
}