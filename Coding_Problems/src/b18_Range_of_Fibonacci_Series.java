

import java.util.Scanner;

public class b18_Range_of_Fibonacci_Series {

	public static void main(String[] args) {
		// Write a program to display range of FIBONACCI numbers?
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range to dispaly fibonnaci series");
		int range=sc.nextInt();
		
		int n1=1,n2=1,num=0;
		System.out.println(n1+"\n"+n2);
		for(int i=1;num<range;i++)
		{
			num=n1+n2;
			if(num>range)
				break;
			System.out.println(num);
			n1=n2;
			n2=num;
		}

	}

}
