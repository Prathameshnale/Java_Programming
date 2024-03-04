
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ComparatorAndComparable {

	
	//comparator is a interface,by using that we can define our own logic for sorting.
	//if we return 1 then it will swap numbers
	//if we return -1 then it will not swap numbers(keep as it is);
	
	public static void main(String[] args) {
		
		Comparator<Integer> comp=new Comparator<Integer>(){   //this is how we can use comparator interface for our own logic
			@Override
			public int compare(Integer i1, Integer i2) {
				if(i1%10>i2%10) {
					return 1; //if we do return 1 then it will automatically swaps the numbers
				}
				return -1; //if we do return -1 then it will not swap the numbers
			}	
			

		};
		
		
		Comparator<String> comps=new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				System.out.println(s1.charAt(s1.length()-1));
				if(s1.charAt(s1.length()-1)<s2.charAt(s2.length()-1)) {
					return 1;
				}
				return 0;
			}
			
		};
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		List<Integer> alist = new ArrayList<>();
		List<String> slist = new ArrayList<>();
		
		
		
		
		
//------------------------------------------------------------------------------------------		
		
//		System.out.println("Enter the number of elements in array ");
//		int size=sc.nextInt();
//		
//		
//		int num=0;
//		for(int i=0;i<size;i++) {
//			num=sc.nextInt();
//			alist.add(num);
//		}
//		
//		System.out.println("Before sort = "+alist);
//		
//		Collections.sort(alist);
//		 
//		System.out.println("After sort = "+alist);
//		
//		Collections.sort(alist,comp);  //this is how we can give call to compare method after writting our own logic and implement 
		                                  //comparator interface.
//		
//		System.out.println("After comparator method = "+alist);
		
		
		//------------------------------------------------------------------------------------------		
		
		
//		System.out.println("Enter the number of elements in String array ");
//		int size=sc.nextInt();
//		
//		String str=null;
//		for(int i=0;i<size;i++) {
//			str=sc.next();
//			slist.add(str);
//		}
//		
//		System.out.println("Before sort = "+slist);
//		
//		Collections.sort(slist);
//		
//		System.out.println("after sort = "+slist);
//		
//		Collections.sort(slist,comps);
//		
//		System.out.println("After comparator method = "+slist);
		
		
		
		
		
		
		//------------------------------------------------------------------------------------------	
		
		
		
		//comparable ->  when we have to sort the array list of pre-defined data type like Integer,String then that class
		                //has already implemented by comparable interface and that comparable interface has compreTo method
		               	//which will help to sort the array but
		//In case of sorting the arrayList of user defined data type like Student,Employee and so on.this classes are not 
		//implemented by comparable method so we should have to implement that interface manually to that class then and 
		//then only we can use sort function. and
		//if we want to our own logic to sort arrayList of(Student,Emoployee,etc classes) then we can also use comparator interface.
		
		List<Student> stdlist=new ArrayList<Student>();
		stdlist.add(new Student(71,"prathamesh"));
		stdlist.add(new Student(52,"rushi"));
		stdlist.add(new Student(63,"arjun"));
		stdlist.add(new Student(44,"prasad"));
		stdlist.add(new Student(85,"digvijay"));
		
		
		for(Student s:stdlist) {
			System.out.println(s);
		}
		
		System.out.println("After sort:");
		Collections.sort(stdlist);
		for(Student s:stdlist) {
			System.out.println(s);
		}
		
		
		System.out.println("After writting logic in compareTo method sort = ");
		Collections.sort(stdlist);
		for(Student s:stdlist) {
			System.out.println(s);
		}
		
		
		Comparator<Student> comst=new Comparator<Student>(){

			@Override
			public int compare(Student s1, Student s2) {
				if(s1.getId()>s2.getId()) {
					return 1;
				}
				return -1;
			}
		};
		
		System.out.println("After wrtting logic using comparator interface sort = ");
		Collections.sort(stdlist,comst);
		for(Student s:stdlist) {
			System.out.println(s);
		}
		
		
	}

}
