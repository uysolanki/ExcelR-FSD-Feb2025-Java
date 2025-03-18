package day7;

public class Circle implements Shape
{

	@Override
	public void area() {
		int radius=5;
		double result=3.14*radius*radius;
		System.out.println("Area of Circle is "+result);
		
	}

	@Override
	public void perimeter() {
		int radius=5;
		double result=2*3.14*radius;
		System.out.println("Perimeter of Circle is "+result);
		
	}

}
