package day6;

import java.util.Scanner;

public class Student {

	private int rno;
	private String sname;
	private double per;
	
	
	public void acceptStudent()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rno");
		rno=sc.nextInt();
		
		System.out.println("Enter name");
		sname=sc.next();
		
		System.out.println("Enter per");
		per=sc.nextDouble();
	}
	
	void displayStudent()
	{
		System.out.print("Rno is "+rno);
		System.out.print(", Name is "+sname);
		System.out.println(", Per is "+per);
	}

	//overloading
	public boolean search(int r) {
		if(this.rno==r)
			return true;
		else
			return false;
	}

	public boolean search(String n) {
		if(this.sname.equalsIgnoreCase(n))
			return true;
		else
			return false;
	}
	
	
}
