package day6;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Student students[]=new Student[4];
		for(int i=0;i<students.length;i++)
		{
			students[i]=new Student();
			students[i].acceptStudent();
		}

		for(int i=0;i<students.length;i++)
		{
			students[i].displayStudent();
		}
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rno to search");  //3 Found , 7 Not Found
		int r=sc.nextInt();
		int i;
		for(i=0;i<students.length;i++)
		{
			if(students[i].search(r))
			{
				System.out.println("Found");
				break;
			}
		}
		
		if(i==students.length)
			System.out.println("Not Found");
		
		
		System.out.println("Enter name to search");  //3 Found , 7 Not Found
		String n=sc.next();
		for(i=0;i<students.length;i++)
		{
			if(students[i].search(n))
			{
				System.out.println("Found");
				break;
			}
		}
		
		if(i==students.length)
			System.out.println("Not Found");
	}

}
