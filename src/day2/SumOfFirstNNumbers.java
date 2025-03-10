package day2;

import java.util.Scanner;

public class SumOfFirstNNumbers {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");  //92
		int n=sc.nextInt();
		
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+ i*i;
		}
		System.out.println(sum);

	}

}
//1 + 4 + 9 + 16 + 25 + 36
//sum =0,1,5,14,30,55,91