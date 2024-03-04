

import java.util.Scanner;

public class b35_display_box_with_filled_stars {

	public static void main(String[] args) {
		// Write a program to display the FILLED BOX with stars?
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rows=sc.nextInt();
		
		for(int i=1;i<rows;i++)
		{
			for(int j=1;j<rows;j++)
			{
				if(i == 1 || j == 1 || i == rows || j == rows - 1) {
					System.out.print(" *");
				}			
			}
			System.out.println();
		}

	}

}
