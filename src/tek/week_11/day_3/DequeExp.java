package tek.week_11.day_3;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExp {

  /*

  It's important to note that the Stack class is considered somewhat outdated and not as versatile as other collections.
  The Deque interface and classes that implement it (such as ArrayDeque) are generally preferred over Stack because they provide a more
  complete and consistent set of LIFO stack operations. Here's how you might use a Deque as a stack

  */

    public static void main(String[] args) {

        Deque<String> stack = new ArrayDeque<>();

        // adding elements to your stack
        stack.push("Bob");
        stack.push("Alex");
        stack.push("Eric");
        stack.push("Lydia");

        // Check the top of the stack
        System.out.println("Top of the stack: (PEEK) " + stack.peek() );

        // print before popping an item
        System.out.println( stack );

        System.out.println(" * * * * *  * * * * * * * * * * * * * * * * * * * *");

        // Removing an item from the stack
//        stack.pop();
        System.out.println("Removing (poping) a value from the stack: " + stack.pop() );

        // print after popping an item
        System.out.println( stack );

        System.out.println(" * * * * *  * * * * * * * * * * * * * * * * * * * *");

        // Popping all of the items from the stack
        while ( !stack.isEmpty() ) {
            System.out.println("Popping (Removing) item: " + stack.pop() );
        }

        System.out.println(" * * * * *  * * * * * * * * * * * * * * * * * * * *");

        // print after popping all of items from the stack
        System.out.println( stack );

    }

}
