import java.util.Scanner;

public class b73_Display_common_elements_between_two_arrays {

	public static void main(String[] args) {
		// Write a program to DISPLAY THE COMMON ELEMENTS between two
		// arrays?
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of first array");
		int size1=sc.nextInt();
		
		int[] arr1 = new int[size1];
		System.out.println("Enter "+size1+" elements in first array");
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("Enter the size of second array");
		int size2=sc.nextInt();
		
		int[] arr2 = new int[size2];
		System.out.println("Enter "+size2+" elements in second array");
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=sc.nextInt();
		}
		
		boolean status=false;
		System.out.print("Common elements between two arrays are -> ");
		for(int i=0;i<arr1.length;i++) {
			status=false;
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					status=true;
				}
			}
			if(status) {
				System.out.print(arr1[i]+" ");
			}
		}

	}

}
