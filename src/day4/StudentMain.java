package day4;

public class StudentMain {

	public static void main(String[] args) {
//      classname objectname  =     new   classname    ();
		Student   s1 = new  Student();
		Student   s2 = new  Student(18,"Virat",78.5); //int,String,double
		Student   s3 = new  Student();
		
		s1.displayStudent();
		s2.displayStudent();
		s3.displayStudent();
		
//		s1.acceptStudent();
//		s2.acceptStudent();
//		
//		s1.displayStudent();
//		s2.displayStudent();
//		s3.displayStudent();

	}

}
