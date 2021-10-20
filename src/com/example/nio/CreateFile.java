package com.example.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFile {
   public static void main(String[] args) {
      //initialize Path object
      Path path = Paths.get("D:file.txt");
      //create file
      try {
         Path createdFilePath = Files.createFile(path);
         System.out.println("Created a file at : "+createdFilePath);
      } 
      catch (IOException e) {
         e.printStackTrace();
      }
   }
}