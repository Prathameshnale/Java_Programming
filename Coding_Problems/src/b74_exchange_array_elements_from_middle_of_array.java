import java.util.Scanner;

public class b74_exchange_array_elements_from_middle_of_array {

	public static void main(String[] args) {
		// Write a program to EXCHANGE OF FIRST PART ELEMENT TO SECOND
		// PART Element between two arrays?
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of first array");
		int size=sc.nextInt();
		
		int[] arr = new int[size];
		System.out.println("Enter "+size+" elements in first array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		int s1,s2;
		s1=size/2;
		s2=(arr.length-s1);
		
		int[] arr1 = new int[s1];
		int[] arr2 = new int[s2];
		
		
		for(int i=0;i<s1;i++) {
			arr1[i]=arr[i];
		}
		
		for(int i=s1;i<s2;i++) {
			arr2[i]=arr[i];
		}
		
		for(int i=0;i<s2;i++) {
			if(i<s1) {
				arr[i]=arr1[i];
			}else
			{
				arr[i]=arr2[i];
			}
		}

	}

}
