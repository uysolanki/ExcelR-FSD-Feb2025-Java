package day1;

import java.util.Scanner;

public class Assg1 {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double height1;
		double height2;
		double totalheight;
		
		System.out.println("Please enter your Child height");  //5.3
		height1=sc.nextDouble();
		
		System.out.println("Please enter your Father height");  //5.6
		height2=sc.nextDouble();
		
		totalheight=height1+height2;
		
		System.out.println("The Total height of father and Child is "+totalheight);
		//System.out.println("Thank You");
	}
}
//Accept the age of mother and son and display total age;