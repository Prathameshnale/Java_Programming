
public class b60_Program_on_Bubble_Sort {

	public static void main(String[] args) {
		// Write a program for BUBBLE SORT?
		
		int[] arr={1,5,58,441,26,59,42,54,85,20,0,15,02,41};
		System.out.println("Before Sort:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<(arr.length-i-1);j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("After Sort:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}

	}

}
