package appointment;

//Appointment Service: In the Module Five milestone, you developed the appointment service. 
//The appointment service used in-memory data structures to support storing appointments (no database required). 
//In addition, there was no UI for this assignment. You verified the appointment service through JUnit tests. 
//The appointment service contained an appointment object along with the appointment service. 
//The requirements were as follows:
//
//Appointment Requirements
//
//The appointment object shall have a required unique appointment ID String that cannot be longer than 10 characters. 
//The appointment ID shall not be null and shall not be update able.
//The appointment object shall have a required appointment Date field. 
//The appointmentDate field cannot be in the past. The appointmentDate field shall not be null. 
//Note: Use java.util.Date for the appointmentDate field and use before(new Date()) to check if the date is in the past.
//The appointment object shall have a required description String field that cannot be longer than 50 characters. 
//The description field shall not be null.
//
//Appointment Service Requirements
//
//The appointment service shall be able to add appointments with a unique appointmentId.
//The appointment service shall be able to delete appointments per appointmentId.

import java.util.Date;

    public class AppointmentClass{
//private access modifier for encapsulation	
	    private final String ID;
	    private String description;
	    private Date date;
 
// Parameterized constructor
    public AppointmentClass (String ID, Date date, String description) {
    	
    	Date currentDate = new Date();
    	
		if(ID == null || ID.length()>10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		if(date == null || currentDate.before(date)) {
			throw new IllegalArgumentException("Invalid Date");
		}
		if(description == null || description.length()>50) {
			throw new IllegalArgumentException("Invalid Description");
		}
		
// Invoking the parent class constructor
		this.ID = ID;
		this.date = date;
		this.description = description;

    }
    
// Accessors and Mutators
// Getters and Setters

 // Getter for description
		public String getDescription() {
			return description;
		}
// Setter for description	
		public void setDescription(String description) {
			this.description = description;
		}
// Getter for description	
		public Date getDate() {
			return date;
		}
// Setter for description	
		public void setDate(Date date) {
			this.date = date;
		}
// Getter for ID	
		public String getID() {
			return ID;
		}
		
}

		