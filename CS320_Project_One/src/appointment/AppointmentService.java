package appointment;


/*
The appointment service shall be able to add appointments with a unique appointment ID.
The appointment service shall be able to delete appointments per appointment ID.
*/


// Professor Wilson ignore the print outs-- I like to see something printed
// so I know what and where things are happening.

import java.util.ArrayList;

public class AppointmentService {
   /* this contains a list of Appointments */
   private ArrayList<AppointmentClass> appointments;

   /* the default constructor */
   public AppointmentService() {
	   appointments = new ArrayList<>();
   }

   /*  method adds  Appointments to array list if its not already present */
   public boolean add(AppointmentClass appointment) {
       /* Is task present */
       boolean alreadyPresent = false;
       for (AppointmentClass c : appointments) {
           if (c.equals(appointment)) {
               alreadyPresent = true;
           }
       }
       /* if not present then we add Appointment, and return true else false*/
       if (!alreadyPresent) {
    	   appointments.add(appointment);
           System.out.println("Appointment Added Successfully!");
           return true;
       } else {
           System.out.println("Appointment already present");
           return false;
       }
   }

   /* method removes a Appointment with given ID if present */
   public boolean remove(String ID) {
       for (AppointmentClass c : appointments) {
           if (c.getID().equals(ID)) {
        	   appointments.remove(c);
               System.out.println("Appointment removed Successfully!");
               return true;
           }
       }
       System.out.println("Appointment not present");
       return false;
   }

   /*
    ********************** IGNORE BELOW THE APP DOES NOT REQUIRE UPDATE OF APPOINTMENT*****************
   * this method updates the Appointment of the ID, if found updates it
   *  passes empty string if certain id attributes stay same

   public boolean update(String ID, String name, String description) {
       for (Appointment c : tasks) {
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
    ********************** IGNORE Above THE APP DOES NOT REQUIRE UPDATE OF APPOINTMENT******************/
}