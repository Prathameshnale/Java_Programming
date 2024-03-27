import java.util.Scanner;

public class b67_find_first_and_second_biggest_element_in_array {

	public static void main(String[] args) {
		// Write a program to find FIRST BIGGEST AND SECOND BIGGEST ELEMENT
		// in given array

		/*
		  
		    arr	[0]	‐‐‐‐>1	
			arr	[1]	‐‐‐‐>8	
			arr	[2]	‐‐‐‐>99	
			arr	[3]	‐‐‐‐>66	
			arr	[4]	‐‐‐‐>75
		  
		    First biggest element is 99	
			Second	biggest	element	is 66	
		 */
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of element");
		int size=sc.nextInt();
		int[] arr=new int[size];
		
		System.out.println("Enter the "+size+" elements in array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr ["+i+"] --->"+arr[i]);
		}
		
		
		int first_biggest=arr[0];
		int second_biggest=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(first_biggest<arr[i]) {
				first_biggest=arr[i];
			}
			if(second_biggest<arr[i] && arr[i]<first_biggest) {
				second_biggest=arr[i];
			}
		}
		
		
		
		
		System.out.println("First Biggest element is --->"+first_biggest);
		System.out.println("Second Biggest element is --->"+second_biggest);

	}

}


















