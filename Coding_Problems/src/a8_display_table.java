

import java.util.Scanner;

public class a8_display_table {

	public static void main(String[] args) {
		// Write a program to display MULTIPLICATION table?
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to display table:");
		int num=sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+" * "+i+" = "+num*i);
		}

	}

}
