

import java.util.Scanner;

public class a7_sum_of_Prime_numbers {

	public static void main(String[] args) {
		// Write a program to find SUM OF PRIME numbers?
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to calcalate sum of prime:");
		int num=sc.nextInt();
		
		int sum=0;
		
		for(int i=1;i<=num;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			
			if(count==2)
			{
				sum=sum+i;
			}
		}
		
		System.out.println("Sum of prime = "+sum);

	}

}
