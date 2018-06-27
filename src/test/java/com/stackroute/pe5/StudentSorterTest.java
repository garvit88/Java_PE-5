package com.stackroute.pe5;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

public class StudentSorterTest {

	@Test
	public void testCompare() {
		Student s1 = new Student(1, "pqr", 20);
		Student s2 = new Student(2, "pqr", 30);
		Student s3 = new Student(3, "abc", 20);
		Student s4 = new Student(4, "pqr", 30);
		Student s5 = new Student(5, "someone", 25);
		
		ArrayList<Student> actualList = new ArrayList<Student>();
		actualList.add(s1);
		actualList.add(s2);
		actualList.add(s3);
		actualList.add(s4);
		actualList.add(s5);
        
        ArrayList<Student> expctedList = new ArrayList<Student>();
        expctedList.add(s4);
        expctedList.add(s2);
        expctedList.add(s5);
        expctedList.add(s1);
        expctedList.add(s3);
	        
        Collections.sort(actualList, new StudentSorter());
		assertEquals(
				"testCompare(): testCompare function failed, the value returned by the function is not as expected",
				expctedList,actualList);
		
	}

}
