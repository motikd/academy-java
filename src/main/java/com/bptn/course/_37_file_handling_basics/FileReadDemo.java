package com.bptn.course._37_file_handling_basics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadDemo {

	public static void main(String[] args) {
		
		try {
			FileReader reader = new FileReader("Sample.txt");
			BufferedReader bufferedReader = new BufferedReader(reader);
			String line;
			while ((line=bufferedReader.readLine())!=null) {
				System.out.println(line);	
			}

			}catch (IOException e) {
				System.out.println("Something is Wrong!");
				e.printStackTrace();		
			

			}
		}

	}


