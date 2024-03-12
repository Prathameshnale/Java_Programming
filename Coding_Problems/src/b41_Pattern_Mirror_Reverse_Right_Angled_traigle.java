import java.util.Scanner;

public class b41_Pattern_Mirror_Reverse_Right_Angled_traigle {

	public static void main(String[] args) {
		// Write a program to display Reverse Triangle with stars?
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int rows=sc.nextInt();
		int a=1;
		
		for(int i=1;i<=rows;i++) {
			int space=i-1;
			a=1;
			while(a<=space) {
				System.out.print("  ");
				a++;
			}
			for(int j=0;j<=rows-i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
