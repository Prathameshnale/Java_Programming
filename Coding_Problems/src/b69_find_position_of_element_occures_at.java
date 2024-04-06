import java.util.Scanner;

public class b69_find_position_of_element_occures_at {

	public static void main(String[] args) {
		// Write a program to FIND THE OCCURRENCE ELEMENT IN which position
		// in a given array
		
		/*
		  Input -> 11
		   
		  output ->
			0‐‐‐‐‐‐‐>22	
			1‐‐‐‐‐‐‐>11	
			2‐‐‐‐‐‐‐>23	
			3‐‐‐‐‐‐‐>11	
			4‐‐‐‐‐‐‐>15	
			5‐‐‐‐‐‐‐>19	
			6‐‐‐‐‐‐‐>11	
			Your element found at index 3
		 */
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter element that u want to findout");
		int element=sc.nextInt();
		System.out.println("Enter the number of occurence of element "+element);
		int occure=sc.nextInt();
		int position=-1;
		int count=0;
		
		
		int[] arr = {22,11,23,11,15,19,11};
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==element)
			{	
				count++;
				if(count==occure) {
					position=i;
					break;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(i+"----->"+arr[i]);
		}
		if(position==-1) {
			System.out.println("Element not found at any index");
		}else {
			System.out.println("Element found at index "+position);
		}
	}

}
