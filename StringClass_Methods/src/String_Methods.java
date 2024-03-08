import java.util.Scanner;

public class String_Methods {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str="prathamesh";
		String str1="Nale";
		String str2="Arjun";
		String str3="Digvijay";
		String str4="Jadhav";
		String str5="Rushikesh and Prasad";
		String str6="Arjun";
		String str7=new String("Arjun");
		
		System.out.println("ans = "+str);
		System.out.println("ans = "+str5.codePointAt(9));
		System.out.println("ans = "+str5.codePointCount(14, 19));
		System.out.println("ans1 = "+str2.compareTo(str1)); //-13
		System.out.println("ans2 = "+str2.compareTo(str6)); //0
		System.out.println("str2.equals(str1) = "+str2.equals(str1)); 
		System.out.println("str2.equals(str6) = "+str2.equals(str6));
		System.out.println("(str2==str6) = "+(str2==str6));
		
		
//		The Java string equals() method, compares two strings and returns true if all characters match in both strings, else returns false.
//
//		The == operator compares the reference or memory location of objects in a heap, whether they point to the same location or not.
		
		System.out.println("(str2==str7) = "+(str2==str7));
		
		System.out.println("getbytes = "+str3.getBytes());
		System.out.println("indexOf() = "+str3.indexOf("y"));
		System.out.println("matches = "+str3.matches("[A-Za-z]"));
		
		System.out.println("substring() = "+str3.substring(3));   //it will print all string from index 3 onwords (including index 3);
		System.out.println("substring() = "+str3.substring(3,6)); //it will print string from index 3 (including 3) to index 6(excluding 6);
		
		
		

		String str8="Hello, thanks for attempting this problem! Hope it will help you to learn java! Good luck and have a nice day!";
		
		String[] arr=str8.split(", |\\?|'| ");
		for(String s:arr) {
			System.out.println(s);
		}
		
		String str9="abc";  //constant pool area
		String str10="abc";   //constant pool area
		String str11=new String("abc");  //heap area
		
		System.out.println("str9==str10 = "+(str9==str10));
		System.out.println("str9==str11 = "+(str9==str11));
		
		String str12=str11.intern(); //intern will convert heap area object into constant pool object 
		System.out.println("str9==str12 = "+(str9==str12));

	}

}
