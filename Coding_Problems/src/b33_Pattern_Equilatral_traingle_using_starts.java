

import java.util.Scanner;

public class b33_Pattern_Equilatral_traingle_using_starts {

	public static void main(String[] args) {
		//Write a program to display EQUILATERAL TRIANGLE with stars?
		
		System.out.println("Enter the number of rows to be printed on equilatral traingle:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();



		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=num-i;j++)
			{
				System.out.print(" ");  //it should be space only use of \t will change the output
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
			
	}
}



