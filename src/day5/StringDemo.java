package day5;

public class StringDemo {

	public static void main(String[] args) {
		String name="  Virat Kohli";
		String email="virat@excer.com";
		//String method;
		
		int len=name.length();
		System.out.println("Length of String is "+len);
		
		System.out.println("Uppercase "+name.toUpperCase());
		
		System.out.println("Lowercase "+name.toLowerCase());
		
		System.out.println(name);
		System.out.println(name.trim());
		System.out.println(name.trim().charAt(4));
		
		System.out.println(email.endsWith("excelr.com"));
		
		String s1="Shreyas";
		String s2="Iyer";
		
		s1=s1.concat(" ").concat(s2);
		
		System.out.println(s1);
		
		String s3="SHreYas"; //="shreyas"
		String s4="shReyaS"; //="shreyas"
		
//		if(s3.equalsIgnoreCase(s4))
//				System.out.println("Strings are EQUAL");
//		else
//			    System.out.println("Strings are NOT EQUAL");
		
		
		if(s3.toLowerCase().equals(s4.toLowerCase()))
			System.out.println("Strings are EQUAL");
		else
		    System.out.println("Strings are NOT EQUAL");
		
		System.out.println("-----------------$$$-----------");
		String s5="Ali";
		String s6="Tom";
		// +ve = compareTo("Tom","Ali")
		System.out.println(s6.compareTo(s5));
		
		// -ve = compareTo("Ali","Tom")
		System.out.println(s5.compareTo(s6));
		
		// 0 = compareTo("Ali","Ali")
		System.out.println(s5.compareTo(s5));
		
		String studName="Alice";
		int age=19;
		double height=5.6;
		
		//My name is Alice i am 19 years old my height is 5.6 feet
		System.out.println("My name is " + studName + " i am "  + age +  " years old my height is "+ height + " feet");
		
		System.out.println(String.format("My name is %s i am %d years old my height is %.1f feet",studName,age,height));
		

	}

}
