import java.util.Scanner;

public class b44_String_is_panagram_or_not {

	public static void main(String[] args) {
		// Write program weather the string is PANAGRAM or not?
		
		//Def:	a	sentence	containing	every	letter	of	the	alphabet.
		//26	letters	(alphabets)	without	any	repetition. (in case of perfect panagram
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String to check Panagram or not");
		String str=sc.nextLine();
		str=str.toUpperCase();
		
		String newstr="";
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(c>=65 && c<=90) {
				newstr=newstr+c;
			}
		}
		
		//System.out.println("newStr = "+newstr+" length = "+newstr.length());
		
		
			boolean status=false;
			for(int i=65;i<=90;i++) {
				status=false;
				for(int j=0;j<newstr.length();j++) {
					if(i==newstr.charAt(j)) {
						status=true;
					}
				}
				if(!status) {
					System.out.println("String is not panagram");
				}
			}
			if(status) {
				System.out.println("String is panagram");
			}
	}

}
