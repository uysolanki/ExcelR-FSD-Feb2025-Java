package day2;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Number between 1 to 7");	//1 - Sun
		int number=sc.nextInt();								//2 - Mon
																//7	- Sat
		
		switch(number)
		{
		case 1 : System.out.println("Today is Sunday"); break;
		case 2 : System.out.println("Today is Monday"); break;
		case 3 : System.out.println("Today is Tuesday"); break;
		case 4 : System.out.println("Today is Wednesday"); break;
		case 5 : System.out.println("Today is Thursday"); break;
		case 6 : System.out.println("Today is Friday"); break;
		case 7 : System.out.println("Today is Saturday"); break;
		default : System.out.println("Invalid Input");
		}
		System.out.println("Thank you");
	}

}
//vowel  a vowel display name of celebrity name