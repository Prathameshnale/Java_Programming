import java.util.Scanner;

public class b68_find_second_time_occurence_index_of_element {
	
		public static void main(String[] args) {
			//Write a program to FIND THE SECOND OCCURRENCE ELEMENT in a given
			// array
			
			
			/*
			  
			    arr	[0]	‐‐‐‐‐‐‐>22	
				arr	[1]	‐‐‐‐‐‐‐>11	
				arr	[2]	‐‐‐‐‐‐‐>23	
				arr	[3]	‐‐‐‐‐‐‐>11	
				arr	[4]	‐‐‐‐‐‐‐>15	
				arr	[5]	‐‐‐‐‐‐‐>19	
				arr	[6]	‐‐‐‐‐‐‐>11	
				Second	time	occurred	element	found	at	the	index	3
			  
			 */
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter size of element");
			int size=sc.nextInt();
			int[] arr=new int[size];
			
			System.out.println("Enter the "+size+" elements in array");
			for(int i=0;i<arr.length;i++) {
				arr[i]=sc.nextInt();
			}
			
			for(int i=0;i<arr.length;i++) {
				System.out.println("arr ["+i+"] --->"+arr[i]);
			}
			
			int index=-1;
			boolean status=false;
			for(int i=0;i<arr.length;i++) {
				for(int j=(i+1);j<arr.length;j++) {
					if(arr[i]==arr[j]) {
						index=j;
						status=true;
						break;
					}		
				}
				if(status) {
					break;
				}
			}
			
			if(index==-1) {
				System.out.println("Second time occurence element not found");
			}else {
				System.out.println("Second time occurence element found at index --->"+index);
			}
		}
}











