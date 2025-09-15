

import java.util.Scanner;

public class b10_perfect_number {

	public static void main(String[] args) {
		// Write program weather the number is PERFECT NUMBER or not?
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to check perfect number or not");
		int number=sc.nextInt();
		Integer count = 0;
		
		for(int i=1;i<number;i++) {
			if(number%i==0) {
				count=count+i;
			}
		}
		if(number == 1) {
			System.out.println("1 is not perfect number");
		}
		else if(number == count) {
			System.out.println("number is perfect number");
		}else {
			System.out.println("number is not perfect number");
		}
		
}

}
