import java.util.Scanner;

public class b63_insert_element_in_array_at_specific_position {

	public static void main(String[] args) {
		// Write a program to INSERT A ELEMENT INTO EXISTING ARRAY in a
		// specified position?
	 
		
		/*
		 //input -> size and array elements
		//ouput
		length	of	array	before	inserting‐‐‐>5	
		0‐‐‐‐‐‐‐>2	
		1‐‐‐‐‐‐‐>8	
		2‐‐‐‐‐‐‐>6	
		3‐‐‐‐‐‐‐>7	
		4‐‐‐‐‐‐‐>88	
		enter	the	index	of	specified	position	or	index	
		3	
		enter	the	element	to	replace	to	specified	index	
		62	
		length	of	array	after	inserting‐‐‐>6	
		0‐‐‐‐‐‐‐>2	
		1‐‐‐‐‐‐‐>8	
		2‐‐‐‐‐‐‐>6	
		3‐‐‐‐‐‐‐>62	
		4‐‐‐‐‐‐‐>7	
		5‐‐‐‐‐‐‐>88

		 */
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		int[] arr=new int[size];		
		System.out.println("Enter "+size+" elements in array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Length of array before inserting -->"+arr.length);
		for(int i=0;i<arr.length;i++) {
			System.out.println(i+" --->"+arr[i]);
		}
		
		
		System.out.println("Enter the index of specific position");
		int index=sc.nextInt();
		
		System.out.println("Enter the element at index "+index);
		int element=sc.nextInt();
		
		
		int[] newarr=new int[size+1];
		
		if(index<0 || index>arr.length) {
			System.out.println("You Entered wrong index position");
		}else {

			for(int i=0;i<arr.length;i++) {
				newarr[i]=arr[i];
			}
			for(int i=(newarr.length-1);i>index;i--) {
				newarr[i]=newarr[i-1];	
			}
			newarr[index]=element;
			
			
			System.out.println("Length of array After inserting -->"+newarr.length);
			for(int i=0;i<newarr.length;i++) {
				System.out.println(i+" --->"+newarr[i]);
			}
		}
		
		
		

	}

}
















