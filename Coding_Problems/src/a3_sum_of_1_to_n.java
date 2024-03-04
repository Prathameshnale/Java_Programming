

import java.util.Scanner;

public class a3_sum_of_1_to_n {

	public static void main(String[] args) {
		// Write a program to display sum of 1 to N numbers?
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			sum=sum+i;
		}
		
		System.out.println("Sum = "+sum);

	}

}
