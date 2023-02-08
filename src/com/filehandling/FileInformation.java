package com.filehandling;

import java.io.File;

public class FileInformation {

	public static void main(String[] args) {
		String path = "G:\\JAVA_Projects\\Full Stack Projects\\FileHandling\\FileStorage";
		File file = new File(path+"\\newFile.pdf");
		if (file.exists()) {
			System.out.println("Name: "+file.getName());
			System.out.println("Path: "+file.getAbsolutePath());
			System.out.println("File: "+file.getAbsoluteFile());
			System.out.println("Parent: "+file.getParent());
			System.out.println("Witable?: "+file.canWrite());
			System.out.println("Readable?: "+file.canRead());
			System.out.println("Length: "+file.length());
		}else {
			System.out.println("File doesn't exits");
		}
	}

}
