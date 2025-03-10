//run a loop to accept a number from user and display the number , if user enters zero stop the loop
package day2;

import java.util.Scanner;

public class DoWhileDemo2 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int n;
		do
		{
			System.out.println("Enter a Number");  
			n=sc.nextInt();
			System.out.println(n);	
		}while(n!=0);
		
		System.out.println("loop Terminated");
	}

}
