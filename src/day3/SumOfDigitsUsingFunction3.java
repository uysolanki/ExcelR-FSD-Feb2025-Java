package day3;
import java.util.Scanner;

public class SumOfDigitsUsingFunction3 {

	public static void main(String[] args) {
		int result;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");//123 			//n								r		sum
		int n=sc.nextInt();	
		result=sumOfDigit(n);
		System.out.println(result);
	}

	private static int sumOfDigit(int n) {
															//123		is 123>0 True		3		0
		int sum=0;											//12		is 12>0 True		2		3
		while(n>0)											//1			is 1>0 True			1		5
		{													//0			is 0>0 False				6
			int r=n%10; // %10 gives last digit
			sum=sum+r;
			n=n/10;   // /10 cuts the last digit
		}

		return sum;
		
	}

}
