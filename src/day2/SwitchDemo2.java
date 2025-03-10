package day2;

import java.util.Scanner;

public class SwitchDemo2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Vowel Char");	//"A"=> "a"= > 'a'
		char c=sc.next().toLowerCase().charAt(0);								
																
		
		switch(c)
		{
		case 'a' : System.out.println("Akshay Kumar"); break;
		case 'e' : System.out.println("Eminem"); break;
		case 'i' : System.out.println("Imran Khan"); break;
		case 'o' : System.out.println("Om"); break;
		case 'u' : System.out.println("Umar"); break;
		default : System.out.println("Invalid Input");
		}
		System.out.println("Thank you");
	}

}
//vowel  a vowel display name of celebrity name