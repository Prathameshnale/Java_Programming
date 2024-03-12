import java.util.Scanner;

public class b39_Pattern_Reverse_Right_Angled_Trangle {

	public static void main(String[] args) {
		// Write a program to display DOWNWARD MIRROR of RIGHT ANGLE
		//triangle with stars?
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rows=sc.nextInt();
		
		int temp=rows;
		for(int i=1;i<=rows;i++) {
			for(int j=temp;j>=1;j--){
				System.out.print("* ");
			}
			temp--;
			System.out.println();
		}

	}

}