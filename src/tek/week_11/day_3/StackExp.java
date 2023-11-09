package tek.week_11.day_3;

import java.util.Stack;

public class StackExp {

/*
    In Java, a Stack is a last-in-first-out (LIFO) stack of objects. It is part of the Java Collections Framework and extends Vector
    with five operations that allow it to be treated as a stack. The usual push and pop operations are provided, as well as a method
    to peek at the top item on the stack, a method to test for whether the stack is empty, and a method to search the stack for an item
    and discover how far it is from the top.

    When you use a stack, you only add to and remove from the top of the stack, much like a stack of plates. Here's a breakdown of
    the Stack class's key methods:

    push(E item): Pushes an item onto the top of the stack.
    pop(): Removes the object at the top of the stack and returns it.
    peek(): Looks at the object at the top of the stack without removing it.
    empty(): Tests if the stack is empty.
    search(Object o): Returns the 1-based position from the top of the stack where an object is located; returns -1 if the object is not on
    the stack.

*/

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

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

        // Search for an item in the stack
        System.out.println( stack.search("Eric") ); // 1 -> Since the Eric is available
        System.out.println( stack.search("Lydia") ); // -1 -> Since lydia is not available

        System.out.println(" * * * * *  * * * * * * * * * * * * * * * * * * * *");


        // Check if the stack is empty or not
        System.out.println("Is my stack empty: " + stack.empty() );

        System.out.println(" * * * * *  * * * * * * * * * * * * * * * * * * * *");

        // Popping all of the items from the stack
        while ( !stack.empty() ) {
            System.out.println("Popping (Removing) item: " + stack.pop() );
        }

        System.out.println(" * * * * *  * * * * * * * * * * * * * * * * * * * *");

        // print after popping all of items from the stack
        System.out.println( stack );



    }
}
