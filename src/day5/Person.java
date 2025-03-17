package day5;

public class Person {
		int adharNo;
		String name;
		int age;
		String address;
		
		public Person() {//No Args Constructor
			this.adharNo = 1234;
			this.name = "Shreyas";
			this.age =31;
			this.address = "Chennai";
		}  
		public Person(int adharNo, String name, int age, String address) //All Args Constructor
		{
			this.adharNo = adharNo;
			this.name = name;
			this.age = age;
			this.address = address;
		}
		
		void displayPerson()//display
		{
			System.out.println("Adhar Number is "+this.adharNo);
			System.out.println("Name is "+this.name);
			System.out.println("Age is "+this.age);
			System.out.println("Address is "+this.address);
		}
		
}
