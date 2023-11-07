package tek.week_11.day_1;

import java.util.ArrayList;

public class Activity {

/*    Activity 1: Building a Contact List
    Objective:

    Create an ArrayList to store names of contacts and perform various operations to simulate a simple contact management system.

    Steps:

    Declare and initialize an ArrayList of String objects named contactList.
    Add five names to the contactList, simulating adding new contacts.
    Display all contacts in the contactList.
    Check if a given name exists in the contactList. If it exists, print "Contact exists!", otherwise print "Contact not found!".
    Remove a contact from the contactList by name.
    After removal, display the updated list of contacts.*/


/*    Activity 2: Sorting a Book Collection
    Objective:

    Manage a collection of book titles using an ArrayList, perform sort operations, and find the total number of books in the collection.
    Steps:

    Create an ArrayList of String to store book titles named bookCollection.
    Add at least seven book titles to the bookCollection.
    Use Collections.sort() to sort the bookCollection alphabetically.
    Display the sorted bookCollection.
    Find and print the number of books in the bookCollection.*/


    public static void main(String[] args) {

        ArrayList<String> contactList = new ArrayList<>();

        // adding values
        contactList.add("Bob");
        contactList.add("Alex");
        contactList.add("Lydia");
        contactList.add("Mike");
        contactList.add("Eric");

        // display
        System.out.println( contactList );


        if ( contactList.contains("Mike") ) {
            System.out.println("Contact exists!");
        } else {
            System.out.println("Contact not found!");
        }

        // remove element by name
        contactList.remove("Eric");

        // display the updated contact list
        System.out.println( contactList );

    }

}
