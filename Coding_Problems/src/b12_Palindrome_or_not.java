

import java.util.Scanner;

public class b12_Palindrome_or_not {

	public static void main(String[] args) {
		// Write a program to check the given number is PALINDROME or not?
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check palindrome or not");
		int num=sc.nextInt();
		int num1=num;
		int d1=0,d2=0,n1=0,n2=0;
		
		
		
		
//			d1=num1%10;  //for only 3 digits numbers
//			n1=num1/10;
//			d2=n1%10;
//			n2=n1/10;
		
		int sum=0;
		while(num1>0)
		{
			sum=sum*10+(num1%10);
			num1=num1/10;
		}
		
		
		
		if(sum==num)
		{
			System.out.println(num+" is palindrome");
		}else
		{
			System.out.println(num+" is not palindrome");
		}

	}

}
