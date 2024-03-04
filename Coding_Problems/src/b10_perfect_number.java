

import java.util.Scanner;

public class b10_perfect_number {

	public static void main(String[] args) {
		// Write program weather the number is PERFECT NUMBER or not?
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to check perfect number or not");
		int num=sc.nextInt();
		
		
		int sum=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		
		if(sum==num)
		{
			System.out.println(num+" is Perfect Number");
		}else
		{
			System.out.println(num+" is Not Perfect Number");
		}
}

}
