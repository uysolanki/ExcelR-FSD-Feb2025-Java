package day4;

import java.util.Scanner;

public class Student {

	private int rno;
	private String sname;
	private double per;
	
	public Student()  //No args constructor
	{
		rno=1;
		sname="Shreyas";
		per=50.0;
	}
	
	public Student(int a,String b,double c)  //Parameterised constructor
	{
		rno=a;
		sname=b;
		per=c;
	}
	
	public void acceptStudent()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter rno");  //18
		rno=sc.nextInt();
		System.out.println("Enter name"); //Virat
		sname=sc.next();
		System.out.println("Enter Per");  //78.5
		per=sc.nextDouble();
	}
	
	public void displayStudent()
	{
		System.out.println("Rno is "+rno);
		System.out.println("Name is "+sname);
		System.out.println("Per is "+per);
	}
}
