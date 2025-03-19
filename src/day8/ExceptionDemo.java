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
		
		int arr[]=new int[2];
		arr[0]=100;
		arr[1]=200;
		//arr[2]=300;
		}
		catch(ArithmeticException e1)
		{
			System.out.println("Please enter valid denominator");
		}
		catch(InputMismatchException e2)
		{
			System.out.println("Please enter valid integer value only");
		}
		catch(Exception e3)
		{
			System.out.println("Some exception occured");
		}
		finally {
			System.out.println("hii");
		}
	}
}

/*
 1 defination
 2 java natural reaction when exception occurs
 3. various exception classes along with the exception hierarchy
 4. format of eh try catch finally
 5. multiple catch block
 6. default exception
 7. user definec / custom exception
 8. throw
 9. throws keyword
 10. throw, throws, Throwable
 11. categories of exception - checked/unchecked
 
 */
