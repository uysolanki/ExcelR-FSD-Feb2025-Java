package day9;

import java.io.FileInputStream;

public class ReadUsingByteStream {

	public static void main(String[] args) throws Exception {
		String fileName="folder1/file1.txt";
		FileInputStream fis=new FileInputStream(fileName);
		int n;
		char ch;
		while( (n=fis.read())!= -1)
		{
		ch =(char)n;
		System.out.print(ch);
		}

		fis.close();
	}

}
