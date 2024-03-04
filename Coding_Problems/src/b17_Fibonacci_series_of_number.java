

import java.util.Scanner;

public class b17_Fibonacci_series_of_number {

	public static void main(String[] args) {
		// Write a program to display FIBONACCI series of a number

	//	1	1	2	3	5	8
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range");
		int range=sc.nextInt();
		
		int n1=1;
		int n2=1;
		int num=0;
		
		//System.out.println(n1+"\n"+n2);
		for(int i=1;i<=range-2;i++)
		{
			num=n1+n2;
			//System.out.println(num);
			int temp=n2;
			n2=num;
			n1=temp;
		}
		System.out.println(num);
	}

}
