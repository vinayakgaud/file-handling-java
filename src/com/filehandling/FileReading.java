package com.filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class FileReading {

	public static void main(String[] args) throws IOException {
		String path = "G:\\JAVA_Projects\\Full Stack Projects\\FileHandling\\FileStorage";
		File file = new File(path+"\\newFile.pdf");
		
		try {
			FileReader fileReader = new FileReader(file);
			try {
				int i;
				while ((i = fileReader.read()) != -1) {
					System.out.print((char)i);
				}
			} finally {
				fileReader.close();
			}
		} catch (Exception e) {
			e.getLocalizedMessage();
		}
	}

}
