package tek.week_11.day_4;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExp {

/*

A Deque (pronounced "deck") is a double-ended queue that allows the addition or removal of elements from both the front and the
back of the data structure. It is a linear collection that supports element insertion and removal at both ends. The name Deque is an
abbreviation for "Double-Ended Queue".

    The Deque interface in Java is a subtype of the Queue interface and is implemented by classes such as ArrayDeque and LinkedList.
    It provides a richer set of operations than the basic Queue because it allows efficient insertion and removal of elements at both
    ends.

    Key Features of Deque:

    1. Double-Ended: Elements can be added or removed from either the front (head) or the back (tail) of the queue.
    2. No Capacity Restrictions: Unlike arrays, a Deque does not have a fixed size. Implementations like ArrayDeque are resizable arrays
    that grow as needed.
    3. Can Serve as Both Stack and Queue: Due to its dual nature, a Deque can be used both as a FIFO queue and as a LIFO stack.
    4. Null Elements: Most Deque implementations (such as ArrayDeque) do not allow the inclusion of null elements.

    Common Operations:

    Add Elements: addFirst(e), addLast(e), offerFirst(e), offerLast(e)
    Remove Elements: removeFirst(), removeLast(), pollFirst(), pollLast()
    Examine Elements: getFirst(), getLast(), peekFirst(), peekLast()

    */

    public static void main(String[] args) {

        Deque<String> dequeAsQueue = new ArrayDeque<>();
        Deque<String> dequeAsStack = new ArrayDeque<>();

        System.out.println(" * * * * *  * *  DEQUE AS QUEUE * * * * * * *");

        // Using deque as Queue -> First-In-First-Out (FIFO)
        dequeAsQueue.offerLast("Bob");
        dequeAsQueue.offerLast("Lydia");
        dequeAsQueue.offerLast("Eric");
        dequeAsQueue.offerLast("Mike");

        // Print the deque
        System.out.println( dequeAsQueue );

        System.out.println(" * * * * *  * * * * * * * * * * * * * * * * * * * *");

        // Using deque as Stack -> Last-In-First-Out (LIFO)

        System.out.println(" * * * * *  * *  DEQUE AS STACK * * * * * * *");

        dequeAsStack.offerFirst("Bob");
        dequeAsStack.offerFirst("Lydia");
        dequeAsStack.offerFirst("Eric");
        dequeAsStack.offerFirst("Mike");

        // print the deque
        System.out.println( dequeAsStack );

        // print the peek of the start
        System.out.println("Peek of the queue: " + dequeAsQueue.peekFirst() );

        // print end peek value (element)
        System.out.println( "Peek of the stack: " + dequeAsStack.peekLast() );

        System.out.println(" * * * * *  * * * Removing elements from Deque as queue * * * * * * * *");

        while ( !dequeAsQueue.isEmpty() ) {
            System.out.println( " Removing:  " + dequeAsQueue.pollFirst() );
        }

        System.out.println(" * * * * *  * * * * * * * * * * * * * * * * * * * *");




        System.out.println(" * * * * *  * * * Removing elements from Deque as Stack * * * * * * * *");

        while ( !dequeAsStack.isEmpty() ) {
            System.out.println( " Removing:  " + dequeAsStack.pollFirst() );
        }

        System.out.println(" * * * * *  * * * * * * * * * * * * * * * * * * * *");


/*
   * * * * *  * *  DEQUE AS QUEUE * * * * * * *
   *
        [Bob, Lydia, Eric, Mike]
 * * * * *  * * * * * * * * * * * * * * * * * * * *
 *
 * * * * *  * *  DEQUE AS STACK * * * * * * *
 *
        [Mike, Eric, Lydia, Bob]
        *
        Peek of the queue: Bob
        Peek of the stack: Bob
        *
        *  * * * * *  * * * * * * * * * * * * * * * * * * * *
*/

/*

         * * * * *  * * * Removing elements from Deque as queue * * * * * * * *
        Removing:  Bob
        Removing:  Lydia
        Removing:  Eric
        Removing:  Mike
                * * * * *  * * * * * * * * * * * * * * * * * * * *
 * * * * *  * * * Removing elements from Deque as Stack * * * * * * * *
        Removing:  Mike
        Removing:  Eric
        Removing:  Lydia
        Removing:  Bob
* * * * *  * * * * * * * * * * * * * * * * * * * *
*/

        System.out.println(" * * * * *  * * * * * * * * * * * * * * * * * * * *");

        System.out.println( dequeAsQueue );

        // adding element using addFirst()
        dequeAsQueue.addFirst("First Value using add first method");
        dequeAsQueue.addFirst("Last Value using add first method");

        // remove element using the removeFirst()
        System.out.println( "Removing: " + dequeAsQueue.removeFirst() );

        // remove element using the removeLast()
        System.out.println( "Removing: " + dequeAsQueue.removeLast() );

        System.out.println( dequeAsQueue );

        System.out.println(" * * * * *  * * * * * * * * * * * * * * * * * * * *");





    }

}
