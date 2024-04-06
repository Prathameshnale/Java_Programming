import java.util.Scanner;

public class b_70_findout_how_many_times_element_occures {

	public static void main(String[] args) {
		// Write a program to FIND HOW MANY TIMES ELEMENT IS OCCURED in a
		// given array?
		
		/*
		 input -> 11
		 
		 OUTPUT ->
			0‐‐‐‐‐‐‐>22	
			1‐‐‐‐‐‐‐>11	
			2‐‐‐‐‐‐‐>23	
			3‐‐‐‐‐‐‐>11	
			4‐‐‐‐‐‐‐>15	
			5‐‐‐‐‐‐‐>19	
			6‐‐‐‐‐‐‐>11	
			Your element occurred 3
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element that u want to findout");
		int element=sc.nextInt();
		int count=0;
		int[] arr= {22,11,23,11,15,19,11};
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==element) {
				count++;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(i+"---->"+arr[i]);
		}
		
		System.out.println("Your element occurred "+count+" times");

	}

}
