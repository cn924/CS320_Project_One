package task;

/*
 * Task Service Requirements
The task service shall be able to add tasks with a unique ID.
The task service shall be able to delete tasks per task ID.
The task service shall be able to update task fields per task ID. The following fields are update able:
   Name
   Description
*/
// Professor Wilson ignore the print outs-- I like to see something printed
// so I know what and where things are happening.

import java.util.ArrayList;

public class TaskService {
   /* this contains a list of tasks */
   private ArrayList<TaskClass> tasks;

   /* the default constructor */
   public TaskService() {
       tasks = new ArrayList<>();
   }

   /*  method adds  tasks to array list if its not already present */
   public boolean add(TaskClass task) {
       /* Is task present */
       boolean alreadyPresent = false;
       for (TaskClass c : tasks) {
           if (c.equals(task)) {
               alreadyPresent = true;
           }
       }
       /* if not present then we add task, and return true */
       if (!alreadyPresent) {
           tasks.add(task);
           System.out.println("Task Added Successfully!");
           return true;
       } else {
           System.out.println("Task already present");
           return false;
       }
   }

   /* method removes a task with given ID if present */
   public boolean remove(String ID) {
       for (TaskClass c : tasks) {
           if (c.getID().equals(ID)) {
               tasks.remove(c);
               System.out.println("Task removed Successfully!");
               return true;
           }
       }
       System.out.println("Task not present");
       return false;
   }

   /*
   * this method updates the task of the ID, if found updates it
   *  passes empty string if certain id attributes stay same
   */
   public boolean update(String ID, String name, String description) {
       for (TaskClass c : tasks) {
           if (c.getID().equals(ID)) {
               if (!name.equals(""))
                   c.setname(name);
               if (!description.equals(""))
                   c.setdescription(description);

               System.out.println("Task updated Successfully!");
               return true;
           }
       }
       System.out.println("Task not present");
       return false;
   }

}