

import java.util.Scanner;

public class b25_Swap_two_numbers_using_third_variable {

	public static void main(String[] args) {
		// Write a program to Swap two numbers with using 3rd variable?
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers to swap");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		System.out.println("Before swap num1 = "+num1+" num2 = "+num2);
		
		
		int temp;
		temp=num1;
		num1=num2;
		num2=temp;
		
		
		System.out.println("After swap num1 = "+num1+" num2 = "+num2);

	}

}
