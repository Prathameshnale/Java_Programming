//write a fibonacci series with given range

import java.util.Scanner;

public class b17_Fibonacci_series_of_number{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range to print fibonacci series");
		int range = sc.nextInt();
		
		int number=1;
		int temp = 0;
		System.out.print(temp+" "+number);
		while((temp+number)<range) {
			int temp1=number;
			System.out.print(" "+(temp+number));
			number=temp+number;
			temp=temp1;			
		}
		
		
	}
}