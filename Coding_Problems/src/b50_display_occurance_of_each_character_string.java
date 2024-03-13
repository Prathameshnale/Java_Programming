import java.util.Scanner;

public class b50_display_occurance_of_each_character_string {

	public static void main(String[] args) {
		// Write a Program to display OCCURENCES of each character in a STRING?
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		
		String newStr="";
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if((c>=65 && c<=90) || (c>=97 && c<=122)) {
				newStr=newStr+c;
			}
		}
		newStr=newStr.toLowerCase();
		System.out.println("newStr = "+newStr);
		
		String finalStr="";
		boolean status=false;
		int count=0;
		for(int i=0;i<newStr.length();i++) {
			char c=newStr.charAt(i);
			status=false;
			for(int p=0;p<finalStr.length();p++) {
				char ch=finalStr.charAt(p);
				if(c==ch) {
					status=true;
				}
			}
			if(!status) {
				System.out.print(c+" occured ");
				finalStr=finalStr+c;
				count=0;
				for(int j=0;j<newStr.length();j++) {
					char ch1=newStr.charAt(j);
					if(c==ch1) {
						count++;
					}
				}
				System.out.print(count+" times");
				System.out.println();
			}
			
		}
		
		System.out.println(finalStr);

	}

}
