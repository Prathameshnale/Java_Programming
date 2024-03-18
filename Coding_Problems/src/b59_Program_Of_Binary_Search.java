import java.util.Scanner;

public class b59_Program_Of_Binary_Search {

	public static void main(String[] args) {
		
		// Write a program for BINARY SEARCH?
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Element to Search");
		int element=sc.nextInt();
		
		//System.out.println("a "+(int)1/2);
		
		int[] arr={10,40,49,67,86,90};	
		
		
		//for binary search array should be sorted otherwise it will not work properly
		int mid=binarySerach(element,arr);
		
		
		System.out.println("index = "+mid);

	}

	public static int binarySerach(int element, int[] arr) {
		int high=((arr.length)-1),low=0;
		int mid=(low+high)/2;
		
		while(arr[mid]!=element) {
			if(low>=high) {
				return -1;
			}
			if(arr[mid]>element) {
				high=mid-1;
			}
			if(arr[mid]<element) {
				low=mid+1;
			}
			mid=(low+high)/2;
		}
		return mid;
	}

}
