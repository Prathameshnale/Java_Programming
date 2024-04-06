import java.util.Scanner;

public class b71_Display_missing_element_in_sorted_array {

	public static void main(String[] args) {
		// Write a program to DISPLAY MISSING ELEMENT in a given sorted array
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of sorted array");
		int size=sc.nextInt();
		
		int[] arr = new int[size];
		System.out.println("Enter "+size+" elements of array in sorted array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		boolean status=false;
		for(int i=0;i<(arr.length-1);i++) {
			if(arr[i]>arr[i+1]) {
				status=true;
				break;
			}
		}
		
		if(status) {
			System.out.println("You not entered element in sorted order");
		}else {
			System.out.print("Missing element of sorted arrays are -> ");
			int count=arr[0];
			for(int j=arr[0];j<=arr[arr.length-1];j++) {
				status=false;
				for(int i=0;i<arr.length;i++) {
					if(j==arr[i]) {
						status=true;
					}
				}
				if(!status) {
					System.out.print(j+" ");
				}
			}
		}

	}

}
