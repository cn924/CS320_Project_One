package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import task.TaskClass;
//importing the Class - If I do not include these JUnit tests do not work.

//**************Verify the Task Class meets the requirements through JUnit tests.*************


class TaskTest{
	
	@Test
	void testTask() {
		
	TaskClass Task = new TaskClass ("123", "Wilson","SNHU Professor");
	
	// validating assertions are true for values assigned originally
	
	assertTrue(Task.getID().equals("123"));
	assertTrue(Task.getname().equals("Wilson"));
	assertTrue(Task.getdescription().equals("SNHU Professor"));
	}

	//************Test for fields being to long
	
		@Test
		void testContactClassIdToLong() {
			// testing for IllegalArgumentException
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new TaskClass("1234567891011", "Wilson", "SNHU Professor");
			 });      }
		
		@Test
		void testContactClassNameToLong() {
			// testing for IllegalArgumentException
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new TaskClass("123456789", "WilsonWilsonWilsonWilson", "SNHU Professor");
			 });      }
		
		@Test
		void testContactClassDescriptionToLong() {
			// testing for IllegalArgumentException
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new TaskClass("123456789", "Wilson nnn nnn","This description is over fifty characters long. It should be shorter.");
			 });      }
		
		
		//************ FINISHED Test for fields being to long
		
		
		
		//************ Start Test for fields being null
		@Test
		void testContactClassIdIsNull() {
			// testing for IllegalArgumentException
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new TaskClass(null, "Wilson", "SNHU Professor");
			 });      }
		
		@Test
		void testContactClassNameIsNull() {
			// testing for IllegalArgumentException
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new TaskClass("123456789", null, "SNHU Professor");
			 });      }
		
		@Test
		void testContactClassDescriptionIsNull() {
			// testing for IllegalArgumentException
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new TaskClass("123456789", "Wilson", null);
			 });      }
		

		
		//************ FINISHED Test for fields being Null

	}

