

import java.util.Scanner;

public class a1_Print_1_to_n_numbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the digit to print digits from 1 to that number");
		int num=sc.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			System.out.println(i);
		}
	}

}