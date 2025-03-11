package day3;

import java.util.Scanner;

public class SumOfDigitsUsingArray {

	public static void main(String[] args) {
		int arr[] = new int[5];

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter value for " + i + "index");
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) 
		{
			int ans=sumOfDigit(arr[i]);
			System.out.println("The sum of " + arr[i] + " is " +ans);
		}
	}
	private static int sumOfDigit(int n) {
		
		int sum = 0; 
		while (n > 0) 
		{ 
			int r = n % 10;
			sum = sum + r;
			n = n / 10; 
		}
		return sum;
	}
}
