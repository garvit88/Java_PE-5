package com.stackroute.pe5;

import java.util.HashMap;

public class WordCounter {
	
	/*
	 * calculateOccurrence() method takes string as input and it calculates no of 
	 * occurrences of each string and return it in form of HashMap containing the 
	 * string and it's no of occurrences. First string is splitted. Loop is run 
	 * for all the elements of string and it is checked that string should not be 
	 * empty and then if the string is already not present in the map than it is 
	 * added and its value is set to 1 and if it is present the the value of key 
	 * is incremented.
	 */
	
	public HashMap<String, Integer> calculateOccurrence(String str) {
		if(str.isEmpty()) {
			return null;
		}
		String[] stringArray = str.split("\\W|___");
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(String elem: stringArray) {
			if(!elem.isEmpty()) {
				if(map.containsKey(elem)) {
					map.put(elem, map.get(elem)+1);
				} else {
					map.put(elem,1);
				}
			}
		}
		
		return map;
	}

}
