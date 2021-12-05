package contact;

/*Contact Service Requirements
The contact service shall be able to add contacts with a unique ID.
The contact service shall be able to delete contacts per contact ID.
The contact service shall be able to update contact fields per contact ID. The following fields are update able:
	-firstName
	-lastName
	-phone number
	-Address
*/
// Professor Wilson ignore the print outs-- I like to see something printed
// so I know what and where things are happening.

import java.util.ArrayList;

public class ContactService {
   /* this contains a list of contacts */
   private ArrayList<ContactClass> contacts;

   /* the default constructor */
   public ContactService() {
       contacts = new ArrayList<>();
   }

   /*  method adds  contact to array list if its not already present */
   public boolean add(ContactClass contact) {
       /* Is contact present */
       boolean alreadyPresent = false;
       for (ContactClass c : contacts) {
           if (c.equals(contact)) {
               alreadyPresent = true;
           }
       }
       /* if not present then we add contact, and return true */
       if (!alreadyPresent) {
           contacts.add(contact);
           System.out.println("Contact Added Successfully!");
           return true;
       } else {
           System.out.println("Contact already present");
           return false;
       }
   }

   /* method removes a contact with given contactId if present */
   public boolean remove(String ID) {
       for (ContactClass c : contacts) {
           if (c.getID().equals(ID)) {
               contacts.remove(c);
               System.out.println("Contact removed Successfully!");
               return true;
           }
       }
       System.out.println("Contact not present");
       return false;
   }

   /*
   * this method updates the contact of the ID, if found updates it
   *  passes empty string if certain id attributes stay same
   */
   public boolean update(String ID, String firstName, String lastName, 
		   String phoneNumber, String Address) {
       for (ContactClass c : contacts) {
           if (c.getID().equals(ID)) {
               if (!firstName.equals(""))
                   c.setFirstName(firstName);
               if (!lastName.equals(""))
                   c.setLastName(lastName);
               if (!Address.equals(""))
                   c.setAddress(phoneNumber);
               if (!Address.equals(""))
                   c.setAddress(Address);
               System.out.println("Contact updated Successfully!");
               return true;
           }
       }
       System.out.println("Contact not present");
       return false;
   }

}