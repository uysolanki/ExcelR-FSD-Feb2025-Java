package day5;

public class Employee extends Person
{
	int eno;
	String designation;
	double salary;
	
	public Employee() {
		super();
		this.eno=111;
		this.designation="Clerk";
		this.salary=800.0;
	}
	public Employee(int adharNo, String name, int age, String address,int eno,String designation, double salary)
	{
		super(adharNo, name,age,  address);
		this.eno=eno;
		this.designation=designation;
		this.salary=salary;
	}
	
	void displayEmployee()
	{
		super.displayPerson();
		System.out.println("Emp Number is "+this.eno);
		System.out.println("Desg is "+this.designation);
		System.out.println("Salary is "+this.salary);
	}
}
