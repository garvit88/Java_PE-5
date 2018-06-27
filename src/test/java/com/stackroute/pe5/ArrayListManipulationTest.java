package com.stackroute.pe5;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ArrayListManipulationTest {

	static ArrayListManipulation arrayListManipulation;
	ArrayList<String> list;
	
	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		arrayListManipulation = new ArrayListManipulation();
	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		arrayListManipulation = null;

	}

	 @Before
     public void intialization() {
		 list = new ArrayList<String>();
		 list.add("Apple");
		 list.add("Grape");
		 list.add("Melon");
		 list.add("Berry");
     }
	
	@Test
	public void testReplaceElement() {
		ArrayList<String> resultList = new ArrayList<String>();
		resultList.add("Kiwi");
		resultList.add("Grape");
		resultList.add("Melon");
		resultList.add("Berry");
		
		assertEquals(
				"testreplaceElement(): testreplaceElement function failed, the value returned by the function is not as expected",
				resultList,arrayListManipulation.replaceElement(list, "Apple", "Kiwi"));
		
	}
	
	@Test
	public void testClearList() {
		ArrayList<String> resultList = new ArrayList<String>();
		assertEquals(
				"testClearList(): testClearList function failed, the value returned by the function is not as expected",
				resultList,arrayListManipulation.clearList(list));
		
	}
	
}
