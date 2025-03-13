package day5;

public class Person {
		int adharNo;
		String name;
		int age;
		String address;
		
		public Person() {}
		public Person(int adharNo, String name, int age, String address) {
			this.adharNo = adharNo;
			this.name = name;
			this.age = age;
			this.address = address;
		}
		
		void displayPerson()
		{
			System.out.println("Adhar Number is "+this.adharNo);
			System.out.println("Name is "+this.name);
			System.out.println("Age is "+this.age);
			System.out.println("Address is "+this.address);
		}
		
}
