package com.harshal.file;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandeling {

	public static void main(String[] args) {

		//Create a new file
//		File myFile = new File("JavaLearn.txt");
//		try {
//			myFile.createNewFile();
//		} catch (IOException e) {
//			System.out.println("Unable to create this file");
//			e.printStackTrace();
//		}

		//code to write in file
//		try {
//			FileWriter filewriter = new FileWriter("JavaLearn.txt");
//			filewriter.write("This is our File Handling...\nOk Now Bye...");
//			filewriter.close();
//		} 
//		catch (IOException e) {
//			e.printStackTrace();
//		}
//		
		
		//Reading the File
//		File myFile = new File("JavaLearn.txt");
//		try {
//			Scanner	sc = new Scanner(myFile);
//			while (sc.hasNextLine()) {
//				String line = sc.nextLine();
//				System.out.println(line);
//				
//			}
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		
		
		//Deleting the file
		File myFile = new File("JavaLearn.txt");
		if (myFile.delete()) {
			System.out.println("I have deleted "+ myFile.getName());
		}
		else {
			System.out.println("Some problem occured while deleting the file");
		}
	}
}

