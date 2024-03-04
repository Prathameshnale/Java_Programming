

import java.util.Scanner;

public class b21_Prime_Palindrome_or_not {
	
	
	public static boolean palindrome(int num)
	{
		int sum=0;
		int num1=num;
		while(num1>0)
		{
			sum=sum*10+(num1%10);
			num1=num1/10;
		}
		//System.out.println(sum+" "+num);
		if(sum==num)
			return true;
		return false;
	}

	public static void main(String[] args) {
		// Write a program to check the given number is PRIME PALINDROME or not?
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number to check prime palindrome or not");
		int num=sc.nextInt();
		boolean status=true;
		
		for(int i=2;i<=(num/2);i++)
		{
			if(num%i==0)
			{
				status=false;
			}
		}
		//System.out.println(status);
		
		boolean status1=false;
		if(status)
		{
			status1 = palindrome(num);
		}
		
		if(status1)
		{
			System.out.println(num+" is prime Palindrome");
		}else
		{
			System.out.println(num+" is not prime palindrome");
		}
	}

}

