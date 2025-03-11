package day3;

import java.util.Scanner;

public class FunctionScenerio1 {

	public static void main(String[] args) 			//Ambani
	{
		areaRect();
	}

	private static void areaRect() 					//5* Hotel
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Length");
		int length=sc.nextInt();	
		
		System.out.println("Enter Width");
		int width=sc.nextInt();						//buying
		
		int area=length*width;						//cooking
		
		System.out.println("Area of Rectangle is "+area); //serving	
	}

}
