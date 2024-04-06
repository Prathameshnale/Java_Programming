import java.util.Scanner;

public class b72_find_highest_sum_two_continugious_element_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stubWrite a program to FIND HIGHEST CONTIGUOUS SUM OF TWO ELEMENT
		// in a given array?
		
		/*	
		input -> arr={21,12,15,32,16,17,22};
		
		ouput -> 
			Sum	of	two	element‐‐‐‐‐>48	
			The	first	element‐‐‐>32	
			The	second	element‐‐‐>16		*/
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		if(size<2) {
			System.out.println("Size should be > 2");
		}else {
			int[] arr = new int[size];
			System.out.println("Enter "+size+" elements in array");
			for(int i=0;i<arr.length;i++) {
				arr[i]=sc.nextInt();
			}
			
			int highest=arr[0]+arr[1];
			int index=0;
			for(int i=0;i<(arr.length-1);i++) {
				if((arr[i]+arr[i+1])>highest)
				{
					highest=arr[i]+arr[i+1];
					index=i;
				}
			}
			System.out.println("Sum of two element---->"+highest);
			System.out.println("The first element---->"+arr[index]);
			System.out.println("The seocnd element---->"+arr[index+1]);
		}
	}

}