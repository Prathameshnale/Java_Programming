

import java.util.Scanner;

public class b22_check_Number_armstrong_or_not {

	public static void main(String[] args) {
//		Write a Program to check the given number is ARMSTRONG or not?
//			Def: An	Armstrong	number	is	an	integer	such	that	the	sum	of	the	power	of	its	
//				digits	is	equal	to	the	number	itself.	
//				For	example,	371	is	an	Armstrong	number	since	3**3	+	7**3	+	1**3	=	371
		
			Scanner sc = new Scanner (System.in);
			System.out.println("Enter the nubmer to check whether it is armstrong or not:");
			int num = sc.nextInt();
			int temp=num;
			
			int count=0;
			while(temp>0)
			{
				count++;
				temp=temp/10;
			}
			
			//System.out.println(" count = "+count);
			
			temp=num;
			int sum=0;
			while(temp>0)
			{
				int n1=temp%10;
				temp=temp/10;
				int ct=count;
				int ts=1;
				//System.out.println("hi = "+temp);
				while(ct>0)
				{
					ts=ts*n1;
					ct--;
					//System.out.println("by");
				}
				sum=sum+(ts);
			}
			//System.out.println("sum = "+sum+"  num = "+num);
			
			if(num==sum)
			{
				System.out.println(num+" is armstrong number");
				
			}else
			{
				System.out.println(num+" is not armstrong number");
			}
			

	}

}
