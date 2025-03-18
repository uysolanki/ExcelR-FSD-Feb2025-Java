package day7;

public class FootballField extends Rectangle
{

	@Override
	public void perimeter() {
		int length=10;
		int width=5;
		int result=2*(length+width);
		System.out.println("Perimeter of Rectangle is "+result);
		
	}
}
