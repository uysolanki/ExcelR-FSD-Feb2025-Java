package day8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try
		{
		System.out.println("Enter Numerator");  //10
		int num=sc.nextInt();
		System.out.println("Enter Denominator");//0
		int deno=sc.nextInt();
		
		
		double result=num/deno;
		System.out.println("Result is "+result);
		}
		catch(ArithmeticException e1)
		{
			System.out.println("Please enter valid denominator");
		}
		catch(InputMismatchException e2)
		{
			System.out.println("Please enter valid integer value only");
		}

		System.out.println("hii");
	}

}
