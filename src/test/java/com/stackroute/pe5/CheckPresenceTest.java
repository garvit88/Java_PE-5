package com.stackroute.pe5;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class CheckPresenceTest {

	static CheckPresence checkPresence;
	
	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		checkPresence = new CheckPresence();
	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		checkPresence = null;

	}

	@Test
	public void testCalculatePresence() {
		HashMap<String, Boolean> testMap = new HashMap<String, Boolean>();
		testMap.put("a", true);
		testMap.put("b", false);
		testMap.put("c", true);
		testMap.put("d", false);
		
		assertEquals(
				"testCalculatePresence(): testCalculatePresence function failed, the value returned by the function is not as expected",
				testMap,checkPresence.calculatePresence(new String[] {"a","b","c","d","a","c","c"}));
		
	}
	
	@Test
	public void testCalculatePresenceFailure() {
		assertNotNull(
				"testCalculatePresenceFailure(): testCalculatePresenceFailure function failed, giving null values",
				checkPresence.calculatePresence(new String[] {"a","b","c","d","a","c","c"}));
	}

}
