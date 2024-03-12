import java.util.Scanner;

public class b49_count_character_in_each_word_of_string {

	public static void main(String[] args) {
		// Write a Program for number of characters in each WORD and count them?
		/*
		 	e.g.->
		    rama	and	laxmana	
			no	of	character	in	each	word	in	a	string	is	rama	4	and	3	laxmana	7
		 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		
		String newStr="";
		System.out.print("no of character in each word in a string is ");
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=32)
			{
				char c=str.charAt(i);
				newStr=newStr+c;
			}else
			{
				System.out.print(newStr+" "+newStr.length()+" ");
				newStr="";
			}
		}
		System.out.print(newStr+" "+newStr.length());

	}

}
