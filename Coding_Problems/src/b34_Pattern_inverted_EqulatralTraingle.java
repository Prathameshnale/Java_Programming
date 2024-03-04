

import java.util.Scanner;

public class b34_Pattern_inverted_EqulatralTraingle {

	public static void main(String[] args) {
		// Write a program to Display INVERTED TRIANGLE with stars?
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rows=sc.nextInt();
		
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			
			for(int k=rows;k>=i;k--)
			{
				System.out.print("* ");  //use of \t will differ the pattern
			}
			
			
			System.out.println();
		}

	}

}
