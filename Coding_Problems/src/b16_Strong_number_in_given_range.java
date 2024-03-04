

import java.util.Scanner;

public class b16_Strong_number_in_given_range {
	
	
	
	public static int factorial(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		
		return fact;
	}

	public static void main(String[] args) {
		// Write program weather to find range of STRONG NUMBER?
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range to find out strong numbers");
		int range=sc.nextInt();
		
		
		
		for(int i=1;i<=range;i++)
		{
			int sum=0;
			int num=i;
			while(num>0)
			{
				//System.out.println(i);
				int n1=num%10;
				//System.out.println(n1);
				sum=sum+factorial(n1);
				num=num/10;
				
			}
			if(sum==i)
			{
				System.out.println(i+" is a strong number");
			}
		}

	}

}
