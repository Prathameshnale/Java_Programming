import java.util.Scanner;

public class b38_Patter_Right_angled_traingle {

	public static void main(String[] args) {
		// Write a program to display RIGHT ANGLE triangle with stars?
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rows=sc.nextInt();
		
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
