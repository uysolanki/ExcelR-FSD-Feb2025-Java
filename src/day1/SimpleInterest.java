package day1;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// si = (p*n*r) / 100
		
		System.out.println("Enter Principle");
		double p=sc.nextDouble();
		
		System.out.println("Enter rate of interest");
		double r=sc.nextDouble();
		
		System.out.println("Enter Number of years");
		double n=sc.nextDouble();
		
		double si = (p*n*r)/100;
		
		System.out.println("Principle is "+p);
		System.out.println("Rate Of Interest is "+r);
		System.out.println("Number of years is "+n);
		
		System.out.println("Simple Interest is "+si);
		
	}

}
