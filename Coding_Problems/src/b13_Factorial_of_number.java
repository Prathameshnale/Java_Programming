

import java.util.Scanner;

public class b13_Factorial_of_number {

	public static void main(String[] args) {
		//Write a program to find the FACTORIAL of a given number?
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to find factorial");
		int num=sc.nextInt();
		
		int fact=1;
		for(int i=num;i>=1;i--)
		{
			fact=fact * i;
		}
		
		System.out.println("Factorial of "+num+" is "+fact);

	}

}
