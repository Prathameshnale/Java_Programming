

import java.util.Scanner;

public class b19_Reverse_the_number {

	public static void main(String[] args) {
		// Write a program to REVERSE the number?
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to reverse it");
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		
		while(temp>0)
		{
			
			sum=sum*10+(temp%10);
			temp=temp/10;
		}
		
		System.out.println(sum);

	}

}