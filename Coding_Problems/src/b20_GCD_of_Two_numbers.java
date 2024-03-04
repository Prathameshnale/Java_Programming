

import java.util.Scanner;

public class b20_GCD_of_Two_numbers {
	
	public static void main(String[] args) {
		//Write a program to display GCD of two numbers?
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Two number to find out GCD");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		int small=0,large=0;
		if(num1<num2)
		{
			small=num1;
			large=num2;
		}else
		{
			small=num2;
			large=num1;
		}
		
		int gcd=1;
		
		for(int i=1;i<=(small/2);i++)
		{
			if(small%i==0 && large%i==0)
			{
				gcd=i;
			}
		}
		
		System.out.println("GCD of "+num1+" and "+num2+" = "+gcd);
	}

}
