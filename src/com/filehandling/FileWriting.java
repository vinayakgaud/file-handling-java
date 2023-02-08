package com.filehandling;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {

	public static void main(String[] args) throws IOException {
		String path = "G:\\JAVA_Projects\\Full Stack Projects\\FileHandling\\FileStorage";
		File file = new File(path+"\\newFile2.pdf");
		if(file.exists()) {
			FileWriter fw = new FileWriter(file);
			fw.write("Writing a sentence into the file");
			System.out.println("Content is written on file");
			fw.close();
		}else {
			System.out.println("File does not exist");
		}
	}

}
