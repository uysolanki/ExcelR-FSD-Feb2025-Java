package day4;

import java.util.Scanner;

public class Student {

	private int rno;    //object instance variable/scope
	private String sname;
	private double per;
	private static String principalName="Smith";  // class/static scope
	
	public Student()  //No args constructor
	{
		this.rno=1;
		this.sname="Shreyas";
		this.per=50.0;
	}
	
	public Student(int a,String b,double c)  //Parameterised constructor
	{
		this.rno=a;
		this.sname=b;
		this.per=c;
	}
	
	public void acceptStudent()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter rno");  //18
		this.rno=sc.nextInt();
		System.out.println("Enter name"); //Virat
		this.sname=sc.next();
		System.out.println("Enter Per");  //78.5
		this.per=sc.nextDouble();
	}
	
	public void displayStudent()
	{
		System.out.println("Rno is "+this.rno);
		System.out.println("Name is "+this.sname);
		System.out.println("Per is "+this.per);
		
	}
	
	public static void displayPrincipalName()
	{
		System.out.println("Principal Name "+ Student.principalName);
	}
}
