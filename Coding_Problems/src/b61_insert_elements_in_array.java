import java.util.Scanner;

public class b61_insert_elements_in_array {

	public static void main(String[] args) {
		// Write a program to INSERT the ELEMENTS in an Array?
		
		//input - Array size = 5
		//		elements = 10,20,30,40,50
		
//		output = 
//		arr	[0]	‐‐‐‐>2	
//		arr	[1]	‐‐‐‐>3	
//		arr	[2]	‐‐‐‐>5	
//		arr	[3]	‐‐‐‐>8	
//		arr	[4]	‐‐‐‐>64
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		
		int[] arr=new int[size];
		
		System.out.println("Enter the "+size+" elements in array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Elements in array are ->");
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr ["+i+"]  --->"+arr[i]);
		}
		

	}

}
