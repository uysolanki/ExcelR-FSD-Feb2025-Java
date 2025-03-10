package day2;

import java.util.Scanner;

public class SwitchDemo4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1. English");	
		System.out.println("2. Arabic");
		System.out.println("0. Exit");
		System.out.println("Enter Choice");
		int choice=sc.nextInt();								
		switch(choice)
		{
		case 1 : System.out.println("English Accent Options");
				 System.out.println("1. US");	
				 System.out.println("2. UK");
				 System.out.println("0. Exit");
				 System.out.println("Enter Choice");
				 choice=sc.nextInt();	
				 switch(choice)
				 {
				 case 1 : System.out.println("Call Routed to New York"); break;
				 case 2 : System.out.println("Call Routed to London"); break;
				 case 0 : System.exit(0);
				 default : System.out.println("Invalid Input");
				 }			
		break;
		case 2 : System.out.println("Arabic Accent Options");
		 		 System.out.println("1. Qatar");	
		 		 System.out.println("2. UAE");
		 		 System.out.println("0. Exit");
		 		 System.out.println("Enter Choice");
		 		 choice=sc.nextInt();	
		 		 switch(choice)
		 		 {
		 		 case 1 : System.out.println("Call Routed to Doha"); break;
		 		 case 2 : System.out.println("Call Routed to Dubai"); break;
		 		 case 0 : System.exit(0);
		 		 default : System.out.println("Invalid Input");
		 		 } 
		break;
		case 0 : System.exit(0);
		default : System.out.println("Invalid Input");
		}
		System.out.println("Thank you");
	}

}
//vowel  a vowel display name of celebrity name