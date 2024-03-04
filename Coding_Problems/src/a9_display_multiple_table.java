

import java.util.Scanner;

public class a9_display_multiple_table {

	public static void main(String[] args) {
		// Write a program to display MULTIPLICATION TABLES?

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Number to print table:");
		int num=sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=num;j++)
			{
				System.out.print(j+" * "+i+" = "+i*j+"\t");
			}
			System.out.println();
		}
	}

}
