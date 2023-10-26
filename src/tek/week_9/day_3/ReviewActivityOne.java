package tek.week_9.day_3;

public class ReviewActivityOne {

/*
    Book Spine:

    Imagine you have a book spine that can fit only 20 characters.
    Create a StringBuilder with the book title "The Chronicles of Java".
    If the title is more than 20 characters, delete excess characters from the end and append "..." at the end.
    Display the modified title.

*/

    public static void main(String[] args) {

        var stb = new StringBuilder("The Chronicles of Java");
        // stb.append("The Chronicles of Java");

        System.out.println(stb);

        if ( stb.length() > 20 ) {
            stb.setLength(20);
            stb.append("...");
        }

        System.out.println(stb);

/*        var stb = new StringBuilder("Java ");

        System.out.println( stb.length() );
        stb.setLength(3);
        System.out.println( stb.length() );*/

        String name = "Bob";

        System.out.println(name);
        System.out.println( name + "is learning java!" );
        System.out.println(name);
        name = name + "is learning java!";
        System.out.println(name);
        System.out.println(name);
        System.out.println(name);
        System.out.println(name);

    }
}
