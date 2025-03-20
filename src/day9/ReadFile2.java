package day9;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFile2 {

	public static void main(String[] args) throws Exception 
	{
		String fileName="folder1/file1.txt";
		FileReader fr=new FileReader(fileName);
		BufferedReader br=new BufferedReader(fr);
		String data;
		int charCount=0;
		int wordCount=0;
		while(  (data=br.readLine())!=null )
		{
		System.out.println(data.toUpperCase());
		char ch[]=data.toCharArray();
		charCount+=ch.length;
		
		String words[]=data.split(" ");
		wordCount+=words.length;
		}
		
		System.out.println("Number of Chars in the file is "+charCount);
		System.out.println("Number of Words in the file is "+wordCount);
		fr.close();
		br.close();
	}

}
