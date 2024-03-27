import java.util.Scanner;

public class b65_Search_Position_of_element_in_existring_array {

	public static void main(String[] args) {
		// Write a program to SEARCH AN ELEMENT IN THE EXISTING ARRAY?
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		
		int[] arr=new int[size];
		System.out.println("Enter the "+size+" elements in array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			System.out.println(i+"--->"+arr[i]);
		}
		
		int pos=-1;
		
		System.out.println();
		System.out.println("Enter the element to search");
		int ele=sc.nextInt();
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==ele) {
				pos=i;
			}
		}
		
		if(pos==-1) {
			System.out.println("element not found in array");
		}else {
			System.out.println("element found at index --->"+pos);
		}

	}

}
