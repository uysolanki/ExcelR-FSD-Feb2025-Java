package day3;

import java.util.Scanner;

public class FunctionScenerio3 {

	public static void main(String[] args) 			//Common man
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Length");
		int length=sc.nextInt();	
		
		System.out.println("Enter Width");
		int width=sc.nextInt();							   //buy
		int result;
		result=areaRect(length,width);						//call
		System.out.println("Area of Rectangle is "+result); //serving	
	}

	private static int areaRect(int x,int y) 					//Dishonest Caterer
	{
						
		int area=x*y;						//cooking
		
		return area;
	}
}
