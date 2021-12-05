package test;

import static org.junit.Assert.*;
import org.junit.Test;
// importing the Classes - If I do not include these tests do not work
import task.TaskClass;
import task.TaskService;


//**************Verify the Taks Class Service meets the requirements through JUnit tests.*************

/*This Junit Class will help us in testingTaskService class and its methods*/
public class TaskServiceTest {

	/* testing the add method to Pass */
   @Test
   public void testMethodAddPass() {
      TaskService cs = new TaskService();
      TaskClass c1 = new TaskClass("1", "Biden", "The Prez");
      TaskClass c2 = new TaskClass("2", "Harris", "Vice Prez");
      TaskClass c3 = new TaskClass("3", "Pelosi", "She is Speaker");
      // All records can be added
       assertEquals(true, cs.add(c1));
       assertEquals(true, cs.add(c2));
       assertEquals(true, cs.add(c3));
   }

   /* testing the add method to Fail */
   @Test
   public void testMethodAddFail() {
      TaskService cs = new TaskService();
      TaskClass c1 = new TaskClass("1", "Biden", "The Prez");
      TaskClass c2 = new TaskClass("2", "Harris", "Vice Prez");
      TaskClass c3 = new TaskClass("3", "Pelosi", "She is Speaker");
       assertEquals(true, cs.add(c1));
       // Record does exist - can not be added
       assertEquals(false, cs.add(c1));
       assertEquals(true, cs.add(c3));
       assertEquals(true, cs.add(c2));
   }

   /* testing the delete method to Pass*/
   @Test
   public void testMethodDeletePass() {
      TaskService cs = new TaskService();
      TaskClass c1 = new TaskClass("1", "Biden", "The Prez");
      TaskClass c2 = new TaskClass("2", "Harris", "Vice Prez");
      TaskClass c3 = new TaskClass("3", "Pelosi", "She is Speaker");
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
	   TaskService cs = new TaskService();
	   TaskClass c1 = new TaskClass("1", "Biden", "The Prez");
	   TaskClass c2 = new TaskClass("2", "Harris", "Vice Prez");
	   TaskClass c3 = new TaskClass("3", "Pelosi", "She is Speaker");
       assertEquals(true, cs.add(c1));
       assertEquals(true, cs.add(c3));
       assertEquals(true, cs.add(c2));
       //Record 3 does not exist can not be deleted
       assertEquals(false, cs.remove("4"));
       assertEquals(true, cs.remove("2"));
   }

   /* testing the update method to Pass */
   @Test
   public void testUpdatePass() {
	   TaskService cs = new TaskService();
	   TaskClass c1 = new TaskClass("1", "Biden", "The Prez");
	   TaskClass c2 = new TaskClass("2", "Harris", "Vice Prez");
	   TaskClass c3 = new TaskClass("3", "Pelosi", "She is Speaker");
       assertEquals(true, cs.add(c1));
       assertEquals(true, cs.add(c3));
       assertEquals(true, cs.add(c2));
       // Records exist they can be updated
       assertEquals(true, cs.update("3", "Pelosy", "She Speaks"));
       assertEquals(true, cs.update("2", "Kammy", "The Vice President"));
   }

   /* testing the update method to Fail */
   @Test
   public void testUpdateFail() {
	   TaskService cs = new TaskService();
	   TaskClass c1 = new TaskClass("1", "Biden", "The Prez");
	   TaskClass c2 = new TaskClass("2", "Harris", "Vice Prez");
	   TaskClass c3 = new TaskClass("3", "Pelosi", "She is Speaker");
       assertEquals(true, cs.add(c1));
       assertEquals(true, cs.add(c3));
       assertEquals(true, cs.add(c2));
       // Record 4 does not exist no update so false
       assertEquals(false, cs.update("4", "Cora", "Nelson is my wife"));
       assertEquals(true, cs.update("2", "Peace", "Love is always Good."));
   }

}

