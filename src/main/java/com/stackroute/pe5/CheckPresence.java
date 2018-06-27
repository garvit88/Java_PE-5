package com.stackroute.pe5;

import java.util.Arrays;
import java.util.HashMap;

public class CheckPresence {

	/*
	 * calculatePresence() method take array of string as input and is used to 
	 * find if the presence of certain character in the array is equal or greater 
	 * than 2 or not. If it is equal or greater than 2 than the character name as 
	 * key and it's value as true is returned otherwise key values as false is returned. 
	 * First the input array is sorted alphabetically using Arrays.sort(), then the
	 * loop of array length - 1 is started in which if current character is equal 
	 * to next character than there are 2 presence of that character and true value is
	 * set for that character. if the 2 elements are not and also that key is not 
	 * present in the map than it is added and it's value as false is set but in these 2
	 * cases there can be a case when last alone character is left behind because loop 
	 * ran for only length - 1 length so for that last if condition is there which checks
	 * if last character of array is not there than it also sets its value as false and the
	 * map is returned.
	 */
	
	public HashMap<String, Boolean> calculatePresence(String[] stringArray) {
		Arrays.sort(stringArray);
		HashMap<String, Boolean> map = new HashMap<String, Boolean>();
		for(int i = 0; i < stringArray.length-1; i++) {
			if(stringArray[i].equals(stringArray[i+1])) {
				map.put(stringArray[i], true);
			}
			else if(!map.containsKey(stringArray[i])) {
				map.put(stringArray[i], false);
			}
			else if(!map.containsKey(stringArray[stringArray.length-1])) {
				map.put(stringArray[stringArray.length-1], false);
			}
		}
		
		return map; 
	}

}
