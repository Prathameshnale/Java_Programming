
public class MethodsInJava {
	
	public static void main(String args[]) {
		
		Calculate calObj = new Calculate();
		
		//method calling with reference 
		calObj.display();   //method which return nothing
		
		int answer = calObj.add(5,5);  //method return something so we need to store that value
		
		System.out.println("Answer = "+answer);
		
		
		//method having same name but difference in number of parameter or type of parameter
		int ans1 = calObj.sub(2,5);
		int ans2 = calObj.sub(2,5,9);
		float ans3 = calObj.sub(2.4f,6,4);
		
		System.out.println("ans1 = "+ans1+" ans2 = "+ans2+" ans3 = "+ans3);
	}

}
