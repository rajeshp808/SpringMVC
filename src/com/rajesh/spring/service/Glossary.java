package com.rajesh.spring.service;

import java.util.ArrayList;
import java.util.List;

public class Glossary {
	private ArrayList<String> glossary;

	
	public Glossary (String string) {
		
		glossary= GetGlossaryService.readFileIntoList(string);
		setGlossary(glossary);
	}
	
	public ArrayList<String> getGlossary() {
		return glossary;
	}
	

	public void setGlossary(ArrayList<String> glossary) {
		
		this.glossary = glossary;
	}
	
}
