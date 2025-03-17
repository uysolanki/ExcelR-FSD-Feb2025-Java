package day6;

public class Shape {
		//function overloading
	
		final double PI=3.14;
		
		public void area(int length,int width)//rect
		{
			int result=length*width;
			System.out.println("Area of Rectangle is "+result);
		}
		
		public void area(int radius)//rect
		{
			double result=PI*radius*radius;
			System.out.println("Area of Circle is "+result);
		}
}

