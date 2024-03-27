import java.util.Scanner;

public class b64_delete_element_in_array_at_specific_position {

	public static void main(String[] args) {
		// Write a program to DELETE AN ELEMENT OF A SPECIFIED INDEX IN THE
		// EXISTING ARRAY?
		
		/*
		 
		length	of	array	before	deleting‐‐‐>6	
		0‐‐‐‐‐‐‐>5	
		1‐‐‐‐‐‐‐>5	
		2‐‐‐‐‐‐‐>9	
		3‐‐‐‐‐‐‐>8	
		4‐‐‐‐‐‐‐>6	
		5‐‐‐‐‐‐‐>2	
		enter	specified	position	for	deleting	that	element	
		5	
		length	of	array	after	deleting‐‐‐‐>5	
		0‐‐‐‐‐‐‐>5	
		1‐‐‐‐‐‐‐>5	
		2‐‐‐‐‐‐‐>9	
		3‐‐‐‐‐‐‐>8	
		4‐‐‐‐‐‐‐>2	
		 */
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array");
		int size=sc.nextInt();
		
		int[] arr=new int[size];
		
		System.out.println("Enter "+size+" elements in array");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("length of array before deleting-->"+size);
		for(int i=0;i<size;i++) {
			System.out.println(i+"---->"+arr[i]);
		}
		
		
		System.out.println("Enter sprcified posotion for deleting that element");
		int pos=sc.nextInt();
		
		if(pos<0 || pos>=size) {
			System.out.println("Wrong position specified");
		}else {
			int[] newarr= new int[size-1];
			
			for(int i=pos;i<(arr.length-1);i++) {
				arr[i]=arr[i+1];
			}
			
			for(int i=0;i<(size-1);i++) {
				newarr[i]=arr[i];
			}
			
			System.out.println("length of array before deleting-->"+newarr.length);
			for(int i=0;i<newarr.length;i++) {
				System.out.println(i+"---->"+newarr[i]);
			}
			
 		}
		
		

	}

}















