

import java.util.Scanner;

public class a6_check_prime_or_Not {

	public static void main(String[] args) {
		//Write a program to check whether the given number is PRIME or not?
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();
		
		int count=0;
		for(int i=1;i<=num/2;i++)
		{
			if(num%i==0)
			{
				count++;
			}
			if(count>2)
			{
				break;
			}
		}
		if(count==1)
		{
			System.out.println(num+" is prime");
		}else
		{
			System.out.println(num+" is Not prime");
		}

	}

}
