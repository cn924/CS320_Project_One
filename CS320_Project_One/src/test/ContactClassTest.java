package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//importing the Class - If I do not include these JUnit tests do not work.
import contact.ContactClass;


//**************Verify the Contact class meets the requirements through JUnit tests.*************


class ContactClassTest {

	@Test
	void testContactClass() {
		ContactClass contactClass = new ContactClass ("123", "Kayla", "Wilson","555-1234", "123 NH St.");
		
		// validating assertions are true for values assigned originally
		
		assertTrue(contactClass.getID().equals("123"));
		assertTrue(contactClass.getFirstName().equals("Kayla"));
		assertTrue(contactClass.getLastName().equals("Wilson"));
		assertTrue(contactClass.getPhoneNumber().equals("555-1234"));
		assertTrue(contactClass.getAddress().equals("123 NH St."));
	}
	
	//************Test for fields being to long
		
	@Test
	void testContactClassIdToLong() {
		// testing for IllegalArgumentException
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new ContactClass("1234567891011", "Kayla", "Wilson","555-1234", "123 NH St.");
		 });      }
	
	@Test
	void testContactClassFirstNameToLong() {
		// testing for IllegalArgumentException
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new ContactClass("123456789", "Kayla aaaaaa", "Wilson","555-1234", "123 NH St.");
		 });      }
	
	@Test
	void testContactClassLastNameToLong() {
		// testing for IllegalArgumentException
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new ContactClass("123456789", "Kayla", "Wilson nnn nnn","555-1234", "123 NH St.");
		 });      }
	
	@Test
	void testContactClassPhoneNumberToLong() {
		// testing for IllegalArgumentException
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new ContactClass("123456789", "Kayla", "Wilson nnn nnn","555-1234 - 1234", "123 NH St.");
		 });      }
	
	@Test
	void testContactClassAddressToLong() {
		// testing for IllegalArgumentException
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new ContactClass("123456789", "Kayla", "Wilson","555-1234 - 1234", "12345678910 12345678910 12345678910 NH St.");
		 });      }
	
	//************ FINISHED Test for fields being to long
	
	
	
	//************ Start Test for fields being null
	@Test
	void testContactClassIdIsNull() {
		// testing for IllegalArgumentException
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new ContactClass(null, "Kayla", "Wilson","555-1234", "123 NH St.");
		 });      }
	
	@Test
	void testContactClassFirstNameIsNull() {
		// testing for IllegalArgumentException
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new ContactClass("123456789", null, "Wilson","555-1234", "123 NH St.");
		 });      }
	
	@Test
	void testContactClassLastNameIsNull() {
		// testing for IllegalArgumentException
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new ContactClass("123456789", "Kayla", null,"555-1234", "123 NH St.");
		 });      }
	
	@Test
	void testContactClassPhoneNumberIsNull() {
		// testing for IllegalArgumentException
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new ContactClass("123456789", "Kayla", "Wilson nnn nnn",null, "123 NH St.");
		 });      }
	
	@Test
	void testContactClassAddressIsNull() {
		// testing for IllegalArgumentException
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new ContactClass("123456789", "Kayla", "Wilson","555-1234 - 1234", null);
		 });      }
	
	//************ FINISHED Test for fields being Null

}



