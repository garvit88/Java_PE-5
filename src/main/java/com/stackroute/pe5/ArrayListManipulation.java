package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListManipulation {

	/*
	 * replaceElement() method takes the ArrayList<String>, the string to be replaced
	 * and the string to be replaced with. Collection.replaceAll() method is used to 
	 * replace all the string in array list and the updated list is returned. 
	 */
	
	public ArrayList<String> replaceElement(ArrayList<String> itemList, String replace, String newItem) {
		Collections.replaceAll(itemList, replace, newItem);

		return itemList;
	}
	
	/*
	 * clearList() method takes ArrayList<String> as input and is used to clear
	 * all the elements in the List. clear() function is used to clear all the
	 * elements present in the List.
	 */
	
	public ArrayList<String> clearList(ArrayList<String> list) {
		list.clear();
		
		return list;
	}

}
