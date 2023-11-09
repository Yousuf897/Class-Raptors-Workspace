package tek.week_11.day_3;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExp {

/*
    In Java, a Queue is an interface that represents a collection designed for holding elements prior to processing.
    It follows the First-In-First-Out (FIFO) principle, meaning that the head of the queue is the element that has been
    in the queue the longest time, and the tail of the queue is the element that has been in the queue the shortest time.

    Key Features of Queue:

    1. Ordering: Elements in a Queue are ordered in FIFO (first-in-first-out) manner.
    2. Basic Operations: A Queue provides basic operations such as offer to add an element, poll to remove and return the head of the
    queue, and peek to return but not remove the head of the queue.

    3. Concurrency: Some implementations of Queue are designed to be used in a concurrent environment
    (ConcurrentLinkedQueue, BlockingQueue
    4. implementations like ArrayBlockingQueue, LinkedBlockingQueue).

*/

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        // adding elements to your queue
        queue.offer("Bob");
        queue.offer("Lydia");
        queue.offer("Alex");
        queue.offer("Eric");

        // print the elements (items) of your queue
        System.out.println( queue );

        System.out.println(" * * * * *  * * * * * * * * * * * * * * * * * * * *");

        // Print the top of your queue
        System.out.println("Peek or (head) of queue is: " + queue.peek() );

        System.out.println(" * * * * *  * * * * * * * * * * * * * * * * * * * *");

        // Polling an item from the queue
/*        queue.poll();*/
        System.out.println("Polling value: " + queue.poll() );

        System.out.println(" * * * * *  * * * * * * * * * * * * * * * * * * * *");

        // print after polling the head
        System.out.println( queue );

        System.out.println(" * * * * *  * * * * * * * * * * * * * * * * * * * *");

        // Print the top of your queue
        System.out.println("Peek or (head) of queue is: " + queue.peek() );

        System.out.println(" * * * * *  * * * * * * * * * * * * * * * * * * * *");

        while ( !queue.isEmpty() ) {
            System.out.println("Polling (Removing) item: " + queue.poll() );
        }

        System.out.println(" * * * * *  * * * * * * * * * * * * * * * * * * * *");

        // Print the queue after all of the items is being polled up!
        System.out.println( queue );

        System.out.println(" * * * * *  * * * * * * * * * * * * * * * * * * * *");

    }


}
