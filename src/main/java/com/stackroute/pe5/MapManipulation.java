package com.stackroute.pe5;

import java.util.HashMap;

public class MapManipulation {
	
	/*
	 *  changeValues() method accepts HashMap<String, String> as input and in this 
	 *  if val1 has some value than that value has to be copied to val2 and val1 has 
	 *  to be set to empty string. Firstly the condition is checked that the HashMap
	 *  should only have 2 elements otherwise it is not a valid HasMap for this 
	 *  method and also it is checked that keys accepted by this method that is val1
	 *  and val2 should be there and if those keys are not present than also it is 
	 *  not a valid HashMap for this method. If it is a valid map than the value of
	 *  the val1 is taken into string and this string is checked to be not empty
	 *  if it is not a empty string than the val1 value is set to empty string and
	 *  the value of val2 is set to the value of val1.
	 */
	
	public HashMap<String, String> changeValues(HashMap<String, String> inputMap) {
		
		if(inputMap.size() > 2) {
			return null;
		} 
		if(!inputMap.containsKey("val1") && !inputMap.containsKey("val2")) {
			return null;
		}
		
		String val1 = inputMap.get("val1");
		if(!val1.isEmpty()) {
			inputMap.replace("val1", " ");
			inputMap.replace("val2", val1);
		}
		
		return inputMap;
	}
	
}
