import java.util.Scanner;

public class b66_Findout_biggest_smallest_element_in_array {

	public static void main(String[] args) {
		// Write a program to find BIGGEST AND SMALLEST ELEMENT in the given
		// array
		
		/*
		  
		  output->
		  
		    arr	[0]	‐‐‐‐>1	
			arr	[1]	‐‐‐‐>8	
			arr	[2]	‐‐‐‐>99	
			arr	[3]	‐‐‐‐>66	
			arr	[4]	‐‐‐‐>75	
			biggest	element	is	‐‐‐‐>75	
			Smallest	element	is	‐‐‐‐>1
		  
		 */
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		
		int[] arr=new int[size];
		
		System.out.println("Enter the "+size+" elements in array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr ["+i+"] ---->"+arr[i]);
		}
		
		int biggest=arr[0];
		int smallest=arr[0];
		
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>biggest) {
				biggest=arr[i];
			}
			if(arr[i]<smallest) {
				smallest=arr[i];
			}
		}
		
		
		System.out.println("Biggest element is --->"+biggest);
		System.out.println("Smallest element is --->"+smallest);
	
	}

}










