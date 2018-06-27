package com.stackroute.pe5;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.TreeSet;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class SetSortingTest {

	static SetSorting setSorting;
	
	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		setSorting = new SetSorting();
	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		setSorting = null;

	}

	@Test
	public void testsortAlphabetically() {
		TreeSet<String> expectedSet = new TreeSet<String>();
		expectedSet.add("Alice");
		expectedSet.add("Bluto");
		expectedSet.add("Eugene");
		expectedSet.add("Harry");
		expectedSet.add("Olive");
		
		assertEquals(
				"testsortAlphabetically(): testsortAlphabetically function failed, the value returned by the function is not as expected",
				expectedSet,setSorting.sortAlphabetically(new String[] {"Harry","Olive","Alice","Bluto","Eugene"}));
		
	}
	
	@Test
	public void testReturnList() {
		TreeSet<String> set = new TreeSet<String>();
		set.add("Alice");
		set.add("Bluto");
		set.add("Eugene");
		set.add("Harry");
		set.add("Olive");
		
		ArrayList<String> expectedList = new ArrayList<String>();
		expectedList.add("Alice");
		expectedList.add("Bluto");
		expectedList.add("Eugene");
		expectedList.add("Harry");
		expectedList.add("Olive");
		
		assertEquals(
				"testReturnList(): testReturnList function failed, the value returned by the function is not as expected",
				expectedList,setSorting.returnList(set));
		
	}
	
	@Test
	public void testsortAlphabeticallyFailure() {
		assertNotNull(
				"testsortAlphabeticallyFailure(): testsortAlphabeticallyFailure function failed, giving null values",
				setSorting.sortAlphabetically(new String[] {""}));
	}

}
