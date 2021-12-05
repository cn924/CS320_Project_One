package task;

//Task Service: In the Module Four milestone, you developed the task service. 
//The task service used in-memory data structures to support storing tasks (no database required). 
//In addition, there was no UI for this assignment. You verified the task service through JUnit tests. 
//The task service contained a task object along with the task service. The requirements were as follows:
//
//Task Requirements
//
//The task object shall have a required unique task ID String that cannot be longer than 10 characters. 
//The task ID shall not be null and shall not be update able.
//The task object shall have a required name String field that cannot be longer than 20 characters. 
//The name field shall not be null.
//The task object shall have a required description String field that cannot be longer than 50 characters. 
//The description field shall not be null.

//Task Service Requirements
//
//The task service shall be able to add tasks with a unique ID.
//The task service shall be able to delete tasks per taskId.
//The task service shall be able to update task fields per taskId. The following fields are update able:
//*****name
//*****description

//Name String Variables

public class TaskClass {

	private String ID;
	private String name;
	private String description;

// Parameterized constructor

	public TaskClass (String ID, String name, String description) {
		if(ID == null || ID.length()>10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		if(name == null || name.length()>20) {
			throw new IllegalArgumentException("Invalid Name");
		}
		if(description == null || description.length()>50) {
			throw new IllegalArgumentException("Invalid Description");
		}
		
		// Invoking the parent class constructor

				
		this.ID = ID;
		this.name = name;
		this.description = description;


	}
	
	// May Not need the setters for this????
// Accessors and Mutators
// Getters and Setters

// Getter for ID
	public String getID() {
		return ID;
	}

// Setter for ID
	public void setID(String ID) {
		this.ID = ID;
	}
	
// Getter for name
	public String getname() {
		return name;
	}

// Setter for name
	public void setname(String name) {
		this.name = name;
	}

// Getter for description
	public String getdescription() {
		return description;
	}

// Setter for description
	public void setdescription(String description){
		this.description = description;
	}


}


