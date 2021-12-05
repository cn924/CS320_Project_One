package test;

/*
The appointment service shall be able to add appointments with a unique appointment ID.
The appointment service shall be able to delete appointments per appointment ID.
*/
import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;
import org.junit.jupiter.api.Test;

import appointment.AppointmentClass;
import appointment.AppointmentService;

//**************Verify the Appointment Service meets the requirements through JUnit tests.*************

//This Junit Class will help us in testing AppointmentService class and its methods

// testing the add method to Pass 
class AppointmentServiceTest {
	
	//PROFESSOR WILSON - From the Academic Help Center
	
	//Date pastDate = new Date(100, 2, 1);  //March 1 ,2000
	
	Date currentDate = new Date();  //Today's Date
	
	                                      
	//Date futureDate = new Date(300, 2, 1);  //March 1 ,2200
	
	//*************I was to insert pastDate and futureDate in place of currentDate and test.
	
	//This was deprecated using import java.util.Date;
	
	

	 @Test
	   public void testMethodAddPass() {
		 AppointmentService cs = new AppointmentService();
		 AppointmentClass c1 = new AppointmentClass("1", currentDate, "The Prez");
		 AppointmentClass c2 = new AppointmentClass("2", currentDate, "Vice Prez");
		 AppointmentClass c3 = new AppointmentClass("3", currentDate, "She is Speaker");
	      // All records can be added
	       assertEquals(true, cs.add(c1));
	       assertEquals(true, cs.add(c2));
	       assertEquals(true, cs.add(c3));
	   }
	 
	   /* testing the add method to Fail */
	   @Test
	   public void testMethodAddFail() {
		  AppointmentService cs = new AppointmentService();
		  AppointmentClass c1 = new AppointmentClass("1", currentDate, "The Prez");
		  AppointmentClass c2 = new AppointmentClass("2", currentDate, "Vice Prez");
		  AppointmentClass c3 = new AppointmentClass("3", currentDate, "She is Speaker");
	       assertEquals(true, cs.add(c1));
	       // Record does exist - can not be added
	       assertEquals(false, cs.add(c1));
	       assertEquals(true, cs.add(c3));
	       assertEquals(true, cs.add(c2));
	   }
	   
	   /* testing the delete method to Pass*/
	   @Test
	   public void testMethodDeletePass() {
		   AppointmentService cs = new AppointmentService();
		   AppointmentClass c1 = new AppointmentClass("1", currentDate, "The Prez");
		   AppointmentClass c2 = new AppointmentClass("2", currentDate, "Vice Prez");
		   AppointmentClass c3 = new AppointmentClass("3", currentDate, "She is Speaker");
	       assertEquals(true, cs.add(c1));
	       assertEquals(true, cs.add(c2));
	       assertEquals(true, cs.add(c3));
	       // Records 1 and 2 exist so they can be deleted
	       assertEquals(true, cs.remove("1"));
	       assertEquals(true, cs.remove("2"));
	   }

	   /* testing the delete method to Fail*/
	   @Test
	   public void testMethodDeleteFail() {
		   AppointmentService cs = new AppointmentService();
		   AppointmentClass c1 = new AppointmentClass("1", currentDate, "The Prez");
		   AppointmentClass c2 = new AppointmentClass("2", currentDate, "Vice Prez");
		   AppointmentClass c3 = new AppointmentClass("3", currentDate, "She is Speaker");
	       assertEquals(true, cs.add(c1));
	       assertEquals(true, cs.add(c3));
	       assertEquals(true, cs.add(c2));
	       //Record 4 does not exist can not be deleted
	       assertEquals(false, cs.remove("4"));
	       assertEquals(true, cs.remove("2"));

	   }
	}
/*
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

class TestDates_Compare {
 public static void main(String args[]) throws ParseException {

  SimpleDateFormat objSDF = new SimpleDateFormat("dd-mm-yyyy");
  Date dt_1 = objSDF.parse("20-08-1981");
  Date dt_2 = objSDF.parse("12-10-2012");

  System.out.println("Date1 : " + objSDF.format(dt_1));
  System.out.println("Date2 : " + objSDF.format(dt_2));

  if (dt_1.compareTo(dt_2) > 0) {
   System.out.println("Date 1 occurs after Date 2");
  } // compareTo method returns the value greater than 0 if this Date is after the Date argument.
  else if (dt_1.compareTo(dt_2) < 0) {
   System.out.println("Date 1 occurs before Date 2");
  } // compareTo method returns the value less than 0 if this Date is before the Date argument;
  else if (dt_1.compareTo(dt_2) == 0) {
   System.out.println("Both are same dates");
  } // compareTo method returns the value 0 if the argument Date is equal to the second Date;
  else {
   System.out.println("You seem to be a time traveller !!");
  }
 }
}
*/