/*
 
 	Deep copy -> Deep copy is also used to copy the object, while coping the object the values  are copied of both primitive and 
	             object/reference type fields. so to copy values of reference type we need to write our own login inside the clone method
	             so in this case both object are totally independent from each other if we do changes in one object then it won't reflect
	             into another object.
 
 */

class Address1 implements Cloneable{
	private int addid;
	private int flatno;
	public Address1(int addid, int flatno) {
		super();
		this.addid = addid;
		this.flatno = flatno;
	}
	public int getAddid() {
		return addid;
	}
	public void setAddid(int addid) {
		this.addid = addid;
	}
	public int getFlatno() {
		return flatno;
	}
	public void setFlatno(int flatno) {
		this.flatno = flatno;
	}
	@Override
	public String toString() {
		return "Address1 [addid=" + addid + ", flatno=" + flatno + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	
}



class Employee1 implements Cloneable{
	
	private int empid;
	private double salary;
	Address1 add;
	public Employee1(int empid, double salary, Address1 add) {
		super();
		this.empid = empid;
		this.salary = salary;
		this.add = add;
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
	public Address1 getAdd() {
		return add;
	}
	public void setAdd(Address1 add) {
		this.add = add;
	}
	@Override
	public String toString() {
		return "Employee1 [empid=" + empid + ", salary=" + salary + ", add=" + add + "]";
	}
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Employee1 e1=(Employee1) super.clone();
		e1.add=(Address1) add.clone();
		return e1;
	}
	
	
	
}



public class Deep_copy {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee1 e1=new Employee1(1,400000,new Address1(520,25));
		Employee1 e2=(Employee1) e1.clone();
		
		System.out.println("e1 = "+e1);
		System.out.println("e2 = "+e2);
		
		e2.setAdd(new Address1(3748,28));
		System.out.println("e1 = "+e1);
		System.out.println("e2 = "+e2);

	}

}
