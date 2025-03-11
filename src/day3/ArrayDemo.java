package day3;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		int arr[]=new int[10];
		
		System.out.println(Arrays.toString(arr));
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		arr[5]=60;
		arr[6]=70;
		System.out.println(Arrays.toString(arr));
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
		System.out.println("Enter value for " +i+ "index");
		arr[i]=sc.nextInt();	
		}
		
		
		System.out.println(Arrays.toString(arr));

	}

}
