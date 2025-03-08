package day1;

import java.util.Scanner;

public class Test {
	public static void main(String args[])
	{
		int sci;
		int maths;
		int total;
		double avg;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks for Science");  //92
		sci=sc.nextInt();
		
		System.out.println("Enter marks for Maths");  //92
		maths=sc.nextInt();
		
		total=sci+maths;
		avg=total/2;
		
		System.out.println("The total marks is " +total);
		System.out.println("The Avg marks is " +avg);
		
		if(avg>40)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Not Pass");
		}
		
	}

}

