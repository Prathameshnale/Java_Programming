import java.util.Scanner;

public class b40_Pattern_Mirror_Right_Angled_traingle {

	public static void main(String[] args) {
		// Write a program to display MIRROR of RIGHT ANGLE triangle with stars?
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int rows=sc.nextInt();
		
		for(int i=1;i<=rows;i++) {
			int space=rows-i;
			while(space>=1) {
				space--;
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
