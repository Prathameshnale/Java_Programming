

import java.util.Scanner;

public class b37_display_box_and_stars_with_cross_sign_insideBox {

	public static void main(String[] args) {
		// Write a program to display the BOX and CROSS inside it with stars?
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rows = sc.nextInt();
		
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=rows;j++) {
				if(i==1 || i==rows || j==1 || j==rows || i==j || (i+j)==(rows+1)) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
