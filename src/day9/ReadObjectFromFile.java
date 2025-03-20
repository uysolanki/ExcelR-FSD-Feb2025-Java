package day9;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadObjectFromFile {
public static void main(String[] args) throws Exception
{
	String fileName="folder1/file2.txt";
	FileInputStream fis=new FileInputStream(fileName);
	ObjectInputStream ois=new ObjectInputStream(fis);
	Student s2;
	
	s2=(Student)ois.readObject();
	s2.displayStudent();
	
	fis.close();
	ois.close();
}
}
