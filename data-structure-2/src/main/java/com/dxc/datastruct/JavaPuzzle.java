package com.dxc.datastruct;

public class JavaPuzzle {

	 public static void main(String[] args) {
	        StringBuilder originalText = 
	                             new StringBuilder("ABC");
	        StringBuilder text = originalText;
	        originalText.append("DEF");
	        originalText = edit(text);
	        originalText = text.append("XYZ");        
	        System.out.println(originalText);
	        System.out.println(text);
	    }
	
	 static StringBuilder edit(StringBuilder originalText) {
	        return originalText.delete(2, 3);        
	 }
}
