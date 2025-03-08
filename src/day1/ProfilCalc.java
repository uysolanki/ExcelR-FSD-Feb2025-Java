package day1;

import java.util.Scanner;

public class ProfilCalc {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Cost Price");
		double costPrice=sc.nextDouble();
		
		System.out.println("Enter Selling Price");
		double sellPrice=sc.nextDouble();
		
		if(sellPrice>costPrice)
		{
			System.out.println("Profit of Rs "+ (sellPrice-costPrice));
		}
		else if(sellPrice<costPrice)
		{
			System.out.println("Loss of Rs "+ (costPrice-sellPrice));
		}
		else
		{
			System.out.println("No Profit No Loss");
		}
		
		
	}

}
