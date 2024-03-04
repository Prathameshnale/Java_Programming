

import java.util.Scanner;

public class b37_display_box_and_stars_with_cross_sign_insideBox {

	public static void main(String[] args) {
		// Write a program to display the BOX and CROSS inside it with stars?
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rows = sc.nextInt();
		
		for(int i=1;i<=rows;i++)
		{
			if(i==1 || i==rows)
			{
				for(int j=1;j<=rows;j++)
				{
					System.out.print("* ");
				}
			}else
			{
				int start=1;
				int end=rows;
				for(int j=1;j<=rows;j++)
				{
					if(j==1 || j==rows)
					{
						System.out.print("* ");
					}
					if(j==start || j==end)
					{
						System.out.print("* ");
						start++;
						end--;
					}else
					{
						System.out.print("  ");
					}
					
				}
			}
			
			System.out.println();
		}

	}

}
