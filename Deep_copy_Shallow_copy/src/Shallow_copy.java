/*
 
  Shallow copy -> Shallow copy is used to copy the object but while coping the object in shallow copy, primitive type fields are copied
                   with the value but the value of object type fields are not copied only reference of object type fields are copied. 
                   so in this case if we do changes in one object then it will also reflect in original object also.
                   
                   
       so here to achieve the shallow copy first i did implements the clonable marker interface to the Employee class and
       override the clone method of object class.
  
 */

class Address{
	
	private int addid;
	private int flatno;
	
	Address(int addid,int flatno){
		this.addid=addid;
		this.flatno=flatno;
	}

	@Override
	public String toString() {
		return "Address [addid=" + addid + ", flatno=" + flatno + "]";
	}

	
	
	
}

class Employee implements Cloneable{
	
	private int empid;   	//primitive type field
	private double salary;  //primitive type field
	Address add;			//object/reference type field
	
	Employee(int empid,double salary,Address add){
		this.empid=empid;
		this.salary=salary;
		this.add=add;
	}
	
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", salary=" + salary + ", add=" + add + "]";
	}
	
}


public class Shallow_copy {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Employee e1 = new Employee(1,500000,new Address(8876,24));
//		Employee e2 = (Employee) e1.clone();
		Employee e2 = e1;
		System.out.println("e1 = "+e1);
		System.out.println("e2 = "+e2);
		
		e2.setEmpid(4);
		e2.add=new Address(444,27);  //here we do changes in e2 object but it reflect the changes in e1 object also because it copies
		                                  // reference only.
		System.out.println("e1 = "+e1);
		System.out.println("e2 = "+e2);
		

	}

}
