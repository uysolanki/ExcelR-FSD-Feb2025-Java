package day8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter Numerator");  //10
		int num=sc.nextInt();
		System.out.println("Enter Denominator");//0
		int deno=sc.nextInt();
		try
		{
		System.out.println("Result is "+divide(num,deno));
		}
		catch(ArithmeticException e1)
		{
			System.out.println("Please enter valid denominator");
		}
	}

	private static double divide(int num, int deno) throws ArithmeticException
	{
		return num/deno;
	}

}
