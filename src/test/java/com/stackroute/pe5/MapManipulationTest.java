package com.stackroute.pe5;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class MapManipulationTest {

	static MapManipulation mapManipulation;
	
	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		mapManipulation = new MapManipulation();
	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		mapManipulation = null;

	}

	@Test
	public void testChangeValuesOne() {
		
		HashMap<String, String> actualMap = new HashMap<String, String>();
		actualMap.put("val1", "Java");
		actualMap.put("val2", "C++");
		
		HashMap<String, String> expectedMap = new HashMap<String, String>();
		expectedMap.put("val1", " ");
		expectedMap.put("val2", "Java");
		
		assertEquals(
				"testChangeValuesOne(): testChangeValuesOne function failed, the value returned by the function is not as expected",
				expectedMap,mapManipulation.changeValues(actualMap));
		
	}
	
	@Test
	public void testChangeValuesTwo() {
		
		HashMap<String, String> actualMap = new HashMap<String, String>();
		actualMap.put("val1", "mars");
		actualMap.put("val2", "saturn");
		
		HashMap<String, String> expectedMap = new HashMap<String, String>();
		expectedMap.put("val1", " ");
		expectedMap.put("val2", "mars");
		
		assertEquals(
				"testChangeValuesTwo(): testChangeValuesTwo function failed, the value returned by the function is not as expected",
				expectedMap,mapManipulation.changeValues(actualMap));
		
	}
	
	@Test
	public void testChangeValuesThree() {
		
		HashMap<String, String> actualMap = new HashMap<String, String>();
		actualMap.put("val1", "");
		actualMap.put("val2", "saturn");
		
		HashMap<String, String> expectedMap = new HashMap<String, String>();
		expectedMap.put("val1", "");
		expectedMap.put("val2", "saturn");
		
		assertEquals(
				"testChangeValuesThree(): testChangeValuesThree function failed, the value returned by the function is not as expected",
				expectedMap,mapManipulation.changeValues(actualMap));
		
	}

}
