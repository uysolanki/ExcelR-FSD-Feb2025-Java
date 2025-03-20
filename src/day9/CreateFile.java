package day9;

import java.io.FileWriter;

public class CreateFile {

	public static void main(String[] args) throws Exception
	{
		String fileName="folder1/file1.txt";
		FileWriter fr=new FileWriter(fileName,true);
		fr.append("Java FSD");
		fr.close();

	}

}
