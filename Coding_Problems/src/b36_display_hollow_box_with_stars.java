

import java.util.Scanner;

public class b36_display_hollow_box_with_stars {

	public static void main(String[] args) {
		// Write a program to display the HALLOW BOX with stars

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rows = sc.nextInt();
		
		for(int i=1;i<=rows;i++)
		{
			if(i==1 || i==rows)
			{
				for(int j=1;j<=rows;j++)
				{
					System.out.print("*");
				}
			}else
			{
				for(int j=1;j<=rows;j++)
				{
					if(j==1 || j==rows)
					{
						System.out.print("*");
					}else
					{
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}

}
