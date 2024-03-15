import java.util.Scanner;

public class b53_Reverse_words_in_Sentense {

	public static void main(String[] args) {
		// Write a program to REVERSE THE WORDS in a SENTENCE?
		//input:	rama and laxmana
		//ouput:	amar dna anamxal
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		
		String word="";
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(c!=32) {
				word=word+c;
			}else
			{
				for(int j=(word.length()-1);j>=0;j--) {
					System.out.print(word.charAt(j));
				}
				System.out.print(" ");
				word="";
			}
		}
		for(int j=(word.length()-1);j>=0;j--) {
			System.out.print(word.charAt(j));
		}

	}

}
