package day7;

public abstract class Rectangle implements Shape
{

	@Override
	public void area() {
		int length=10;
		int width=5;
		int result=length*width;
		System.out.println("Area of Rectangle is "+result);
		
	}
}
