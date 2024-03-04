import java.util.Scanner;

public class TestArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr=new int[5];
		arr=ArrayService.acceptData(arr);
		ArrayService.displayData(arr);
		int sum = ArrayService.findSum(arr);
		System.out.println("Sum = "+sum);
		System.out.println("Enter the value to search all greater elements of that value");
		int value=sc.nextInt();
		int[] num = ArrayService.findAllGreaterValues(arr,value);
		System.out.println("greater element are:");
		ArrayService.displayData(num);
		System.out.println("Enter element to search position");
		int element=sc.nextInt();
		int position=ArrayService.searchPosotionByElement(element,arr);
		if(position!=-1){
			System.out.println("Element is present at Posotion "+position);
		}else {
			System.out.println("Element is not present");
		}

	}

}
