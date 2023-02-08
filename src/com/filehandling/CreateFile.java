package com.filehandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException{
		String path = "G:\\JAVA_Projects\\Full Stack Projects\\FileHandling\\FileStorage";
		File file = new File(path+"\\newFile.xls");
		if(file.createNewFile()) {
			System.out.println("File created successfully");
		}else {
			System.out.println("File already exits");
		}
	}

}
