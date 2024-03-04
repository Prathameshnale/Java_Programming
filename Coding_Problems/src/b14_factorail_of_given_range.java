

import java.util.Scanner;

public class b14_factorail_of_given_range {
	
	
	public static int factorial(int num)
	{
		int sum=1;
		for(int i=num;i>=1;i--)
		{
			sum=sum*i;
		}
		return sum;
	}

	public static void main(String[] args) {
		// Write a program to find the FACTORIAL of a given RANGE of numbers
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range to print factorial");
		int range=sc.nextInt();
		
		for(int i=1;i<=range;i++)
		{
			System.out.println(i+"!---->"+factorial(i));
		}

	}

}
