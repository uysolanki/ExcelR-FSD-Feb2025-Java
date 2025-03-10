package day2;

public class WhileDemo {

	public static void main(String[] args) {
		//Display your college name 500 times
		
		//Option 1
//		System.out.println("Sathyabama");
//		System.out.println("Sathyabama");
//		System.out.println("Sathyabama");
//		System.out.println("Sathyabama");
//		System.out.println("Sathyabama");

		
		//Option 2
		int i=1;	//Initialization
		while(i<=5)  //Condition
		{
			System.out.println("Sathyabama"+i);  //Task
			i=i+2;  //Increment
		}
		System.out.println("Thank You");

	}

}
