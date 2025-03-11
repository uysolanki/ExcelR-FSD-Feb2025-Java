package day3;

import java.util.Scanner;

public class SumOfArrayElements {
public static void main(String[] args) {
	sumOfArray();
}

private static void sumOfArray() {
int arr[]=new int[5];
	
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<arr.length;i++)
	{
	System.out.println("Enter value for " +i+ "index");
	arr[i]=sc.nextInt();	
	}
	
	int sum=0;
	
	for(int i=0;i<arr.length;i++)
	{
		sum=sum+arr[i];
	}
	
	System.out.println(sum);	
}
	
}
