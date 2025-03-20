package day9;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFile {

	public static void main(String[] args) throws Exception 
	{
		String fileName="folder1/file1.txt";
		FileReader fr=new FileReader(fileName);
		BufferedReader br=new BufferedReader(fr);
		
		String data=br.readLine();
		System.out.println(data.toUpperCase());
		
		char ch[]=data.toCharArray();
		System.out.println("Number of Chars in the file is "+ch.length);
		
		String words[]=data.split(" ");
		System.out.println("Number of Words in the file is "+words.length);
		
		fr.close();
		br.close();
	}

}
