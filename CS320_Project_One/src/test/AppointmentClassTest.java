package test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import appointment.AppointmentClass;

//**************Verify the Appointment Class meets the requirements through JUnit tests.*************

class AppointmentClassTest {
  
	Date currentDate = new Date();
	
	
	// validating assertions are true for values assigned originally
	@Test
	void testAppointment() {
		
		AppointmentClass appointment = new AppointmentClass("123", currentDate,"SNHU Professor");
		
		// validating assertions are true for values assigned originally
		
		assertTrue(appointment.getID().equals("123"));
		assertTrue(appointment.getDate().equals(currentDate));
		assertTrue(appointment.getDescription().equals("SNHU Professor"));
		}
	
	
	//************Test for String fields being to long
	
	@Test
	void testAppointmentClassIdToLong() {		
		// testing for IllegalArgumentException
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new AppointmentClass("1234567891011", currentDate, "SNHU Professor");
		 });      }
	
	
	@Test
	void testAppointmentClassDescriptionToLong() {
		// testing for IllegalArgumentException
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new AppointmentClass("123456789", currentDate,"This description is over fifty characters long. It should be shorter.");
		 });      }
	
	
	//************ FINISHED Test for fields being to long

	
	
	//************ Start Test for fields being null
			@Test
			void testAppointmentClassIdIsNull() {
				// testing for IllegalArgumentException
				Assertions.assertThrows(IllegalArgumentException.class, () -> {
					new AppointmentClass(null, currentDate, "SNHU Professor");
				 });      }
			
			@Test
			void testAppointmentClassDateIsNull() {
				// testing for IllegalArgumentException
				Assertions.assertThrows(IllegalArgumentException.class, () -> {
					new AppointmentClass("123456789", null, "SNHU Professor");
				 });      }
			
			@Test
			void testAppointmentClassDescriptionIsNull() {
				// testing for IllegalArgumentException
				Assertions.assertThrows(IllegalArgumentException.class, () -> {
					new AppointmentClass("123456789", currentDate, null);
				 });      }
					
			//************ FINISHED Test for fields being Null
	
	
	}

//import java.time.LocalDate;  // import the LocalDate class
//
//public class Main {  
//  public static void main(String[] args) {  
//    LocalDate myObj =  LocalDate.now().plusDays(1);  // Create a date object
//    System.out.println(myObj);  // Display the current date
//    
//   
//  }  
//}

