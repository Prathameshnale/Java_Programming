import java.util.Scanner;

public class b58_Program_On_Linear_Search {

	public static void main(String[] args) {
		// Write a program for LINEAR SEARCH?
		
		//input =58 
		//output = 4 (i.e 58 is present at index 4)  OR 
		//output = -1 (i.e if element not present then -1);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Element to search in array");
		int element=sc.nextInt();
		
		int[] arr={3,46,76,4,89,7,27};
		
		int index=-1;
		for(int i=0;i<arr.length;i++) {
			if(element==arr[i]) {
				index=i;
			}
		}
		
		System.out.println("index = "+index);

	}

}
