import java.util.Scanner;

public class b42_Pattern_Sequence_number_Right_traingle_format {

	public static void main(String[] args) {
		// Write a program to display sequence of numbers in TRIANGLE format
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int rows=sc.nextInt();
		int count=1;
		
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}

	}

}
