

import java.util.Scanner;

public class b15_strong_number_or_not {

	
	public static int factorial(int num) {
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	
	
	public static void main(String[] args) {
//		Write program to check the given number is STRONG or not?
//				Def: Strong numbers	are	the	numbers	whose	sum	of	factorial	of	digits	is	equal	to	the	
//				original	number.		
//				Example:	145	is	a	strong number.

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check strong or not");
		int num=sc.nextInt();
		int num1=num;
		int sum=0;
		while(num1>0)
		{
			int fact=num1%10;
			sum=sum+factorial(fact);
			num1=num1/10;
		}
		
		if(sum==num)
		{
			System.out.println(num+" is a strong number");
		}else
		{
			System.out.println(num+"is not strong number");
		}
		
		
		
	}


}
