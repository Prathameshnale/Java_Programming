

import java.util.Scanner;

public class a2_print_Reverse_n_to_1_digits {

	public static void main(String[] args) {
		//Write a program to Print REVERSE of N to 1 numbers?
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		for(int i=num;i>0;i--)
		{
			System.out.println(i);
		}

	}

}
