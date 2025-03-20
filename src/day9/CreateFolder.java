package day9;

import java.io.File;

public class CreateFolder {

	public static void main(String[] args) {
		File file =new File("folder1");
		if(!file.exists())
		{
			file.mkdir();
			System.out.println("Folder Created");
		}

	}

}
