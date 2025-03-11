package day3;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Length");
		int length=sc.nextInt();	
		
		System.out.println("Enter Width");
		int width=sc.nextInt();	
		
		int area=length*width;
		
		System.out.println("Area of Rectangle is "+area);

	}

}
