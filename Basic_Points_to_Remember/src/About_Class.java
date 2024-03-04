
public class About_Class   //In java first letter of classname is always should be in capital letters
{
	int id;
	String name;
	

	
	public void displayData()  //IN java first letter of methods name always start with small letter followed by camal case 
	{
		System.out.println(id+" "+name);
	}
}

/*
 when we create any object of class then memory for reference will get from stack and memory for object will get from 
 the heap area.
 e.g       Student s = new Student();
 
           here Student s is a reference  which will get memory in stack area and
                new Student() is a object which will get memory in heap area 
                
                
 As we create any object of a class then the constructor gets called automatically
 3 types of constructor 
   - default constructor
   - user defined default constructor (parameterless)
   - parameterized constructor
   
   if we not defined any  constructor in our class the by default, default constructor will gets called and
   default values will be assigned to the variable of the objects according to their data types.
   
 Suppose if we defined only one parameterized constructor in class and then
 we create object s1 and passing arguments then the parameterized constructor will gets called but 
 after that we make another object s2 but we are not passing any arguments to the s2 object then it will not called default
 constructor it will give error. so in that case we need to define default constructor .
 i.e if we have any parameterized constructor then we should always have to user defined default constructor (compulsory)
     
 
  
  
  
  
  
  
  
  
  
  

*/