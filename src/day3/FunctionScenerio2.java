package day3;

import java.util.Scanner;

public class FunctionScenerio2 {

	public static void main(String[] args) 			//Common man
	{
		int result;
		result=areaRect();									//call
		System.out.println("Area of Rectangle is "+result); //serving	
	}

	private static int areaRect() 					//Honest Caterer
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Length");
		int length=sc.nextInt();	
		
		System.out.println("Enter Width");
		int width=sc.nextInt();						//buying
		
		int area=length*width;						//cooking
		
		return area;
	}
}
