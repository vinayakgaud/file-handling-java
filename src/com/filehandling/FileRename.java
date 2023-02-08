package com.filehandling;

import java.io.File;

public class FileRename {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "G:\\JAVA_Projects\\Full Stack Projects\\FileHandling\\FileStorage";
		File sourceFile = new File(path+"\\newFile.pdf");
		File destinationFile = new File(path+"\\newFile.txt");
		if(sourceFile.exists()) {
			sourceFile.renameTo(destinationFile);
			System.out.println("file is renamed");
			System.out.println("name: "+sourceFile.getName());
		}else {
			System.out.println("File doesn't exists");
		}
	}

}
