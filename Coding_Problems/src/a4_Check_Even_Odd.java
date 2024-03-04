

import java.util.Scanner;

public class a4_Check_Even_Odd {

	public static void main(String[] args) {
		// Write a program to check given number is EVEN or ODD
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any number to check even or odd");
		int num=sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println(num+" is even");
		}else
		{
			System.out.println(num+" is Odd");
		}
	}

}
