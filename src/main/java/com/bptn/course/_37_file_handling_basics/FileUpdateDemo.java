package com.bptn.course._37_file_handling_basics;

import java.io.FileWriter;
import java.io.IOException;

public class FileUpdateDemo {

 public static void main(String[] args) {

  try {

   FileWriter writer = new FileWriter("Sample.txt", true);
   writer.write("This is a new file!");

//   writer.write("This is a new line to the existing file!");

   System.out.println("File created!");
   writer.close();

  } catch (IOException e) {
   System.out.println("Something went wrong while creating the file: ");
   e.printStackTrace();

  }

 }

}