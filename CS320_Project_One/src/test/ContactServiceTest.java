package test;

import static org.junit.Assert.*;
import org.junit.Test;
// importing the Classes - If I do not include these tests do not work
import contact.ContactClass;
import contact.ContactService;


//**************Verify the Contact Class Service meets the requirements through JUnit tests.*************

/*This Junit Class will help us in testingContactService class and its methods*/
public class ContactServiceTest {

	/* testing the add method to Pass */
   @Test
   public void testMethodAddPass() {
      ContactService cs = new ContactService();
      ContactClass c1 = new ContactClass("1", "Joe", "Biden", "555-1111","111 A ST");
      ContactClass c2 = new ContactClass("2", "Kamala", "Harris", "555-2222", "222 B ST");
      ContactClass c3 = new ContactClass("3", "Nancy", "Pelosi", "555-3333", "333 C ST");
      // All records can be added
       assertEquals(true, cs.add(c1));
       assertEquals(true, cs.add(c2));
       assertEquals(true, cs.add(c3));
   }

   /* testing the add method to Fail */
   @Test
   public void testMethodAddFail() {
      ContactService cs = new ContactService();
      ContactClass c1 = new ContactClass("1", "Joe", "Biden", "555-1111","111 A ST");
	  ContactClass c2 = new ContactClass("2", "Kamala", "Harris", "555-2222", "222 B ST");
	  ContactClass c3 = new ContactClass("3", "Nancy", "Pelosi", "555-3333", "333 C ST");
       assertEquals(true, cs.add(c1));
       // Record does exist - can not be added
       assertEquals(false, cs.add(c1));
       assertEquals(true, cs.add(c3));
       assertEquals(true, cs.add(c2));
   }

   /* testing the delete method to Pass*/
   @Test
   public void testMethodDeletePass() {
      ContactService cs = new ContactService();
      ContactClass c1 = new ContactClass("1", "Joe", "Biden", "555-1111","111 A ST");
	  ContactClass c2 = new ContactClass("2", "Kamala", "Harris", "555-2222", "222 B ST");
	  ContactClass c3 = new ContactClass("3", "Nancy", "Pelosi", "555-3333", "333 C ST");
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
      ContactService cs = new ContactService();
      ContactClass c1 = new ContactClass("1", "Joe", "Biden", "555-1111","111 A ST");
	  ContactClass c2 = new ContactClass("2", "Kamala", "Harris", "555-2222", "222 B ST");
	  ContactClass c3 = new ContactClass("3", "Nancy", "Pelosi", "555-3333", "333 C ST");
       assertEquals(true, cs.add(c1));
       assertEquals(true, cs.add(c3));
       assertEquals(true, cs.add(c2));
       //Record 4 does not exist can not be deleted
       assertEquals(false, cs.remove("4"));
       assertEquals(true, cs.remove("2"));
   }

   /* testing the update method to Pass */
   @Test
   public void testUpdatePass() {
      ContactService cs = new ContactService();
      ContactClass c1 = new ContactClass("1", "Joe", "Biden", "555-1111","111 A ST");
	  ContactClass c2 = new ContactClass("2", "Kamala", "Harris", "555-2222", "222 B ST");
	  ContactClass c3 = new ContactClass("3", "Nancy", "Pelosi", "555-3333", "333 C ST");
       assertEquals(true, cs.add(c1));
       assertEquals(true, cs.add(c3));
       assertEquals(true, cs.add(c2));
       // Records exist they can be updated
       assertEquals(true, cs.update("3", "Nancie", "Pelosy", "555-3334", "333 D ST"));
       assertEquals(true, cs.update("2", "Kammy", "Harry", "555-2223", "222 B ST"));
   }

   /* testing the update method to Fail */
   @Test
   public void testUpdateFail() {
      ContactService cs = new ContactService();
      ContactClass c1 = new ContactClass("1", "Joe", "Biden", "555-1111","111 A ST");
	  ContactClass c2 = new ContactClass("2", "Kamala", "Harris", "555-2222", "222 B ST");
	  ContactClass c3 = new ContactClass("3", "Nancy", "Pelosi", "555-3333", "333 C ST");
       assertEquals(true, cs.add(c1));
       assertEquals(true, cs.add(c3));
       assertEquals(true, cs.add(c2));
       // Record 4 does not exist no update so false
       assertEquals(false, cs.update("4", "Cora", "N", "555-4444", "445 K St"));
       assertEquals(true, cs.update("2", "Summer", "Peace", "555-2221", "444 K ST"));
   }

}

