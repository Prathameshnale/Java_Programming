

import java.util.Scanner;

public class b23_range_of_arstrong_number {

	public static void main(String[] args) {
		// Write a Program to display the range of ARMSTRONG numbers?
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the range to find out armstrong numbers from 1");
		int range = sc.nextInt();

		for(int i=1;i<range;i++)
		{
			int temp=i;
			int count=0;
			while(temp>0)
			{
				count++;
				temp=temp/10;
			}
			
			temp=i;
			int cn=0;
			int cs=1;
			int sum=0;
			while(temp>0)
			{
				int n1=temp%10;
				temp=temp/10;
				cn=count;
				while(cn>0)
				{
					cs=cs*n1;
					cn--;
				}
				sum=sum+cs;
			}
			if(sum==i)
			{
				System.out.println(i+" is armstrong");
			}
		}
	}

}
