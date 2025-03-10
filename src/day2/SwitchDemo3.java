package day2;

import java.util.Scanner;

public class SwitchDemo3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1. English");	
		System.out.println("2. Arabic");
		System.out.println("0. Exit");
		System.out.println("Enter Choice");
		int choice=sc.nextInt();								
																
		
		switch(choice)
		{
		case 1 : System.out.println("Call Routed to London"); break;
		case 2 : System.out.println("Call Routed to Dubai"); break;
		case 0 : System.exit(0);
		default : System.out.println("Invalid Input");
		}
		System.out.println("Thank you");
	}

}
//vowel  a vowel display name of celebrity name