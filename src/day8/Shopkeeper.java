package day8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Shopkeeper {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try
		{
		System.out.println("Enter Order Quantity");  //10
		int qty=sc.nextInt();
		if(qty<500)
		{
			throw new LowQuantityException("Please enter quantity > 500 ");
			//to explicitly throw an exception
		}
		else
			System.out.println("Order Accepted");
		}
		catch(LowQuantityException e1)
		{
			System.out.println(e1.getMessage());
		}
		catch(InputMismatchException e2)
		{
			System.out.println("Please enter valid integer value only");
		}
	}
}
