package day7;

public class Rectangle implements Shape
{

	@Override
	public void area() {
		int length=10;
		int width=5;
		int result=length*width;
		System.out.println("Area of Rectangle is "+result);
		
	}

	@Override
	public void perimeter() {
		int length=10;
		int width=5;
		int result=2*(length+width);
		System.out.println("Perimeter of Rectangle is "+result);
		
	}

}
