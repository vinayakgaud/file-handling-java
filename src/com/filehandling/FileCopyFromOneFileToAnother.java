package com.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyFromOneFileToAnother {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path = "G:\\JAVA_Projects\\Full Stack Projects\\FileHandling\\FileStorage";
		File sourceFile = new File(path+"\\newFile.txt");
		File destinationFile = new File(path+"\\copiedNewFile.txt");
		FileReader fileReader = new FileReader(sourceFile);
		FileWriter fileWriter = new FileWriter(destinationFile);
		int i;
		while((i = fileReader.read())!=1) {
			fileWriter.write((char) i);
		}
		System.out.println("data copied successfully");
		fileWriter.close();
	}

}
