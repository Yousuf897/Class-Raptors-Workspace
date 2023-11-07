package tek.week_11.day_1;

public class ArrayListVsLinkedList {
/*

    ArrayList and LinkedList are two different implementations of the List interface in Java, and they have several differences
    in terms of their data structure and performance:

    ArrayList:

    1. Internal Structure: ArrayList is based on a dynamic array. This means that elements are stored in contiguous memory locations.

    2. Index-based Access: Due to its array-based nature, ArrayList offers fast read access to elements via indexes, making it a good
    choice for frequent get and set operations.

    3. Size Adjustments: When an ArrayList runs out of space, a new, larger array is created, and the old data is copied to the new array,
    which can be a slow operation.

    4. Adding/Removing Elements: Insertions and deletions require shifting elements to maintain the array's continuous nature, which can
    lead to slower operations if they occur in any part other than at the end of the list.

    5. Memory Overhead: ArrayList has less memory overhead compared to LinkedList as it only stores the actual data and maintains a
    small amount of extra space to accommodate growth.

    LinkedList:

    Internal Structure: LinkedList consists of elements where each element contains a reference (link) to the next and previous
     elements, forming a doubly linked list.

    2. Index-based Access: Accessing elements by their index is slower in a LinkedList because it requires sequential traversal starting
     from the head or tail (whichever is closer).

    3. Size Adjustments: A LinkedList naturally accommodates element additions and deletions without the need for resizing or shifting
    elements around.

    4. Adding/Removing Elements: Insertions and deletions are generally faster in a LinkedList, especially when they occur at
     the beginning, middle, or end, since it's a matter of changing the element links.

    5. Memory Overhead: Each element in a LinkedList has a memory overhead because it contains data and two references (links) for the
    next and previous elements.

    When to Use Each:

    Use an ArrayList when:

    You need to access list elements frequently by their index.
    You add or remove elements mainly at the end of the list.
    Memory overhead is a concern, and you prefer contiguous memory utilization.

    Use a LinkedList when:

    You need to frequently add and remove elements from the beginning, middle, or end of the list.
    Memory overhead is less of a concern, and you require the flexibility of a linked structure (e.g., for implementing stack or
     queue operations efficiently).

*/

}
