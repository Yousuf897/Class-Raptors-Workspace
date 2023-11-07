package tek.week_11.day_1;

import java.util.LinkedList;

public class WhatIsLinkedList {

/*
    Real-life Analogy:

    Imagine a treasure hunt where each clue leads you to the next location, and each location has another clue that guides you to the
    subsequent one, until you finally reach the treasure. Each clue is crucial because it tells you where to go next.

    Programming Explanation:

    A LinkedList in Java is a linear data structure where the elements are not stored in contiguous locations like arrays; instead,
    each element (called a node) contains a reference (like the clue in the treasure hunt) to the next node in the list, as well as
     the actual data. This structure allows for efficient insertion and removal of elements at any point in the list, especially at
     the beginning and end.

    In Java, LinkedList is a class that implements the List and Deque interfaces, providing functionalities of both list and
     double-ended queue. It can be visualized as a chain of elements where every element points to its successor, and in the
     case of a doubly-linked list, also to its predecessor.

    Here's how you can think about the LinkedList operations:

    Adding an element: Like adding a new player to a paper-chain where you just need to link hands with the next person.
    Removing an element: Like letting go of the hands, breaking the chain, then rejoining it without you in it.
    Searching for an element: Like walking through the chain of people to find someone specific.

    Advantages of LinkedList:

    Dynamic Data Structure: A LinkedList allocates memory as it grows, no need to define its size beforehand.

            Insertion/Deletions: Adding or removing elements from any part of the list is relatively fast as it doesn’t require
             shifting elements like an array.

    No Memory Wastage: Since it allocates memory as needed, it doesn't reserve memory spaces that might remain unused.

    Disadvantages of LinkedList:

    Direct Access: Unlike arrays, LinkedList does not provide constant-time access to a particular index, which means you have to
    iterate through the list to retrieve an element.

    Memory Overhead: Every element in a LinkedList stores a reference to the next and previous elements, which takes additional memory
    for each element.
*/

    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();

        // adding the value to linked List
        names.add("Bob");
        names.add("Lydia");
        names.add("Bob");
        names.add("Lydia");
        names.add("Alex");
        names.add("Mike");

        System.out.println( names );

        // remove element from LinkedList
        names.remove("Mike");

        System.out.println( names );

        // accessing method from a node
        System.out.println( names.get(0) );

        // modify an element
        names.set(0, "TekSchool");

        System.out.println( names );

        // modify an element
        names.set(2, "UPDATED");

        System.out.println( names );

      //  names.forEach(System.out::println);

        names.add("Mike");
        names.add("Alex");
        names.add("Mike");

        System.out.println( names );

        // remove all elements
        names.removeFirstOccurrence("Mike");
//        names.removeLastOccurrence("Mike");

        System.out.println( names );

        // remove all
        names.removeAll(names);

        System.out.println( names );







    }

}
