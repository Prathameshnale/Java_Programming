

import java.util.Scanner;

public class b26_Conversion_from_binary_to_decimal {
	
	public static void main(String[] args) {
		// Write a program to convert BINARY to DECIMAL?
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter binary number to convert into decimal");
		long bnum=sc.nextLong();
		long bnum1=bnum;
		
		long n1=0;
		long ans=0;
		int count=0;
		
		while(bnum1>0)
		{
			count++;
			n1=bnum1%10;
			bnum1=bnum1/10;
			int n2=1;
			int temp=count;
			if(n1==1)
			{
				while(temp>0 && temp!=1)
				{
					temp--;
					n2=n2*2;
				}
				while(temp>0 && temp==1)
				{
					temp--;
					n2=n2*1;
				}
				ans=ans+n2;
			}
		}
		
		System.out.println("Decimal Number = "+ans);
		
		
	}

}
