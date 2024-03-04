import java.util.Scanner;

public class ArrayService {

	public static int[] acceptData(int[] arr) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 5 elements in array");
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter element no. "+(i+1));
			arr[i]=sc.nextInt();
		}
		
		return arr;
		
	}

	public static void displayData(int[] arr) {
		
		System.out.println("Elements in array are:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		
	}

	public static int findSum(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		return sum;
	}

	public static int[] findAllGreaterValues(int[] arr, int value) {
		int[] arr1=new int[5];
		int count=0;
		for(int i=1;i<arr.length;i++) {
			if(value<arr[i]) {
				arr1[count]=arr[i];
				count++;
			}
		}
		return arr1;
	}

	public static int searchPosotionByElement(int element, int[] arr) {
		int position=-1;
		for(int i=0;i<arr.length;i++) {
			if(element==arr[i])
			{
				return (i+1);
			}
		}
		return -1;
	}

}
