package com.stackroute.pe5;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class WordCounterTest {

	static WordCounter wordCounter;
	
	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		wordCounter = new WordCounter();
	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		wordCounter = null;

	}

	@Test
	public void testCalculateOccurrence() {
		HashMap<String, Integer> testMap = new HashMap<String, Integer>();
		testMap.put("one", 5);
		testMap.put("two", 2);
		testMap.put("three", 2);
		
		assertEquals(
				"testCalculateOccurrence(): testCalculateOccurrence function failed, the value returned by the function is not as expected",
				testMap,wordCounter.calculateOccurrence("one one -one___two,,three,one @three*one?two"));
		
	}
	
	@Test
	public void testCalculateOccurrenceFailure() {
		assertNull(
				"testCalculateOccurrenceFailure(): testCalculateOccurrenceFailure function failed, giving null values",
				wordCounter.calculateOccurrence(""));
	}

}
