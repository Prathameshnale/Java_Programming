//Command line argument


/*

//this programm is about to take arguments from the command line and print them

class AddCmdArgs   //class name should be in always capital letters
{
	public static void main(String[] args)  //JVM always invokes the first function i.e. main function 
	                     // String [] args nothing but the array of the string which store the arguments passed by from command line
	{
		if(args.length==0)  //it will check whether the arguments are passed or not from the command line
		{
			System.out.println("Zero arguments passed ,plase pass the two argumetns");
		}
		else
		{
			System.out.println(args[0]);  //it will print the first arguments which are passed through command line
			System.out.println(args[1]);  //it will print the second arguments which are passed through command line
		}
	}
}
*/






/*

//this programm is about taking more than two numbers from command line and make addition of that all numbers.

class About_Command_Line_Args
{
	public static void main(String[] args)
	{
		if(args.length>=2)
		{
			int sum=0;
			for(int i=0;i<args.length;i++)
			{
				int num=Integer.parseInt(args[i]);  //Incoming arguments from command line are the type of String so here we
				sum=sum+num;                         //we need to make then as Integer type i.e. num=Integer.parseInt();
			}
			System.out.println("Addition = "+sum);
		}
		else
		{
			System.out.println("Plese enter at list two arguments to make addition of them");
		}
	}
}
*/




//this programm is for taking one number from command line and find out the factorial of that number

class About_Command_Line_Args
{
	public static void main(String[] args)
	{
		if(args.length==1)
		{
			int num=Integer.parseInt(args[0]);
			int ans=1;
			for(int i=num;i>0;i--)
			{
				ans=ans*i;
			}
			System.out.println("Factorial = "+ans);
		}
		else
		{
			System.out.println("Plese pass One argument only");
		}
	}
	
}