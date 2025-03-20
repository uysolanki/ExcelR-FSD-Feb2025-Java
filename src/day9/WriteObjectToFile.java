package day9;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteObjectToFile {

	public static void main(String[] args) throws Exception
	{
		String fileName="folder1/file2.txt";
		FileOutputStream fos=new FileOutputStream(fileName);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		Student s1=new Student(45,"Rohit",88.5);
		oos.writeObject(s1);
		
		System.out.println("Object written to file");
		
		fos.close();
		oos.close();

	}

}
