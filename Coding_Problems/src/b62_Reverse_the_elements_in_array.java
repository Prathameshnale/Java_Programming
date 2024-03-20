import java.util.Scanner;

public class b62_Reverse_the_elements_in_array {

	public static void main(String[] args) {
		// Write a Program to REVERSE THE ELEMENTS of an array?
		
		//input - size and elements
		
		//ouput - 
//		Before	Reverse	of	an	Array	
//		arr	[0]	‐‐‐‐>1	
//		arr	[1]	‐‐‐‐>5	
//		arr	[2]	‐‐‐‐>6	
//		arr	[3]	‐‐‐‐>8	
//		arr	[4]	‐‐‐‐>9	
//		
//		After	Reverse	of	an	Array	
//		arr	[0]	‐‐>9	
//		arr	[1]	‐‐>8	
//		arr	[2]	‐‐>6	
//		arr	[3]	‐‐>5	
//		arr	[4]	‐‐>1	
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		
		int[] arr=new int[size];
		
		System.out.println("Enter "+size+" elements in array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Before Reverse of an Array");
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr ["+i+"]  -->"+arr[i]);
		}
		
		for(int i=0;i<(arr.length/2);i++) {
			int temp=arr[i];
			arr[i]=arr[(arr.length-1-i)];
			arr[arr.length-1-i]=temp;
		}
		
		System.out.println("After Reverse of an Array");
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr ["+i+"]  -->"+arr[i]);
		}
		
		


	}

}
