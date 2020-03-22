package com.example.structs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapDemo {

	public Character getFirstNonRepeatedValue(String input) {
		
		input = input.replaceAll("\\s", "");	// removing white spaces
		
		// create Array
		char[] array = input.toCharArray();
		
		Map<Character,Integer> map = new LinkedHashMap<>();
		
		// put the char and count in the Map
		for(char ch:array) {
			int count=0;
			if(map.containsKey(ch)) {
				System.out.println(ch);
				count = map.get(ch);
				map.put(ch, count+1);
			}else {
				map.put(ch,1);
			}
		}
	
		System.out.println(map);
		
		Character ch = null;
		
		for(Entry<Character,Integer> entry:map.entrySet()) {
			System.out.println("BOOM --> " + entry.getKey());
			if(entry.getValue() == 1) {
				ch = entry.getKey();
				break;
			}
		}
		
		return ch;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "mike");
		map.put(2, "ron");
		map.put(3, "jack");
		map.put(3, "roman");
		
		System.out.println(map);
		
		//map.remove(3);
		//System.out.println(map);
		
		for(Entry<Integer,String> i: map.entrySet() ) {
			System.out.println(i.getKey() + " -- " + i.getValue());
		}

		System.out.println(new MapDemo().getFirstNonRepeatedValue("a green apple in mine"));
	}

}
