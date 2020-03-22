package com.example.structs;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {

public Character getFirstRepeatedValue(String input) {
		
		input = input.replaceAll("\\s", "");	// removing white spaces
		
		// create Array
		char[] array = input.toCharArray();
		
		Set<Character> set = new LinkedHashSet();
		
		// put the char and count in the Map
		for(char ch:array) {
			if(set.contains(ch))
				return ch;
			else
				set.add(ch);
		}
	
		System.out.println(set);
		
		return null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Repeated := " +  new SetDemo().getFirstRepeatedValue("a green apple for us"));
	
		System.out.println("thisisbus".hashCode());
		System.out.println(new Integer("11332434").hashCode());
		
	}

}
