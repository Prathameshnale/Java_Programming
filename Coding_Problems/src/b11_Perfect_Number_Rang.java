

import java.util.Scanner;

public class b11_Perfect_Number_Rang {

	public static void main(String[] args) {
		//Write a program to display RANGE of PERFECT NUMBERS?
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range");
		int range=sc.nextInt();
		
		for(int i=1;i<=range;i++)
		{
			int sum=0;
			for(int j=1;j<i;j++)
			{
				if(i%j==0)
				{
					sum=sum+j;
				}
			}
			if(sum==i)
			{
				System.out.println(i+" is a perfect Number");
			}
		}	
	}
}
