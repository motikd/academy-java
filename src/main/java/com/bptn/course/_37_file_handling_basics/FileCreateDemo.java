package com.bptn.course._37_file_handling_basics;

import java.io.FileWriter;
import java.io.IOException;

public class FileCreateDemo {

	public static void main(String[] args) {
		
		try {
			FileWriter writer = new FileWriter("Sample1.txt");
			writer.write(" This is a new File!");
			System.out.println("File Created");
			writer.close();
		}catch (IOException e) {
			System.out.println("Something is Wrong!");
			e.printStackTrace();		}
		

	}

}
