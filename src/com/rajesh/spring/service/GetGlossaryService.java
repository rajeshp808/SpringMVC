package com.rajesh.spring.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GetGlossaryService {
	
	public static ArrayList<String> readFileIntoList(String strFile)  {
		// reading text file into ArrayList in Java 6 
		BufferedReader bufReader = null;
		ArrayList<String> listOfLines = new ArrayList<>(); 
		System.out.println("going to read file "+strFile); 
		try {
			
			bufReader = new BufferedReader(new FileReader(strFile));
			String line = bufReader.readLine();
			System.out.println("read file line "+line); 
			while ((line = bufReader.readLine()) != null) {
				listOfLines.add(line);
				System.out.println("adding line "+line); 
			}
			
			bufReader.close(); 
		} catch (Exception e) {
			System.out.println("Exception in reading file "+e.getMessage());
			e.printStackTrace();
		} 
		
		System.out.println("Content of ArrayLiList:"); 
		System.out.println(listOfLines);
		
		return listOfLines;
	}
	 
}
