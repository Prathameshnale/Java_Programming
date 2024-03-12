import java.util.Scanner;

public class b43_String_Anagram_or_not {

	public static void main(String[] args) {
		// Write a program to find weather a string is ANAGRAM or not?
		/*
		 Def:	a	word,	phrase,	or	name formed	by	rearranging	the	letters	of	another, such as	silent formed	
          from	listen.
          Output:
	 		Enter	the	first	string	
				Mother	in	law	
			Enter	the	second	string	
				Hitler	woman	
			Ans-> string	is	anagram
		  */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String");
		String str1=sc.nextLine();
		System.out.println("Enter second String");
		String str2=sc.nextLine();
		
		str1=str1.toUpperCase();
		str2=str2.toUpperCase();
		
//		System.out.println("str1 = "+str1);
//		System.out.println("str2 = "+str2);
		
		str1=str1.trim();
		str2=str2.trim();
		
		int len1=str1.length();
		int len2=str2.length();
		
		String s1="";
		String s2="";
		
		for(int i=0;i<len1;i++) {
			char c = str1.charAt(i);
			if(c>=65 && c<=90) {
				s1=s1+c;
			}
		}
		
	
		for(int i=0;i<len2;i++) {
			char c = str2.charAt(i);
			if(c>=65 && c<=90) {
				s2=s2+c;
			}
		}
		
//		System.out.println("str1 = "+s1+" length = "+s1.length());
//		System.out.println("str2 = "+s2+" length = "+s2.length());

		if(s1.length()!=s2.length()) {
			System.out.println("String is not Anagram");
		}else {
			boolean status=false;
			for(int i=0;i<s1.length();i++) {
				char c=s1.charAt(i);
				status=false;
				for(int j=0;j<s2.length();j++) {
					if(c==s2.charAt(j)) {
						status=true;
					}	
				}
				if(!status) {
					System.out.println("String is not Anagram");
					break;
				}	
			}
			if(status) {
				System.out.println("String is Anagram");
			}
		}
	}
}
