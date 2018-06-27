package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class SetSorting {
	
	/*
	 * sortAlphabetically() method string array as input, this method sorts the 
	 * elements of the array using TreeSet. String array is passed to TreeSet and
	 * it sorts the array alphabetically and return TreeSet
	 */
	
	public TreeSet<String> sortAlphabetically(String[] names) {
		TreeSet<String> set = new TreeSet<String>(Arrays.asList(names));
		
		return set;
	}
	
	/*
	 * returnList() methods takes TreeSet as input and converts the TreeSet
	 * into ArrayList<String> and returns the same
	 */
	
	public ArrayList<String> returnList(TreeSet<String> set) {
		ArrayList<String> list = new ArrayList<String>(set);
		
		return list;
	}
}
