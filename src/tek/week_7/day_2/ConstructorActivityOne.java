package tek.week_7.day_2;

public class ConstructorActivityOne {

    /*

    Activity 1:

    1.Create a class named Book.

    2.Design a default constructor that sets the book title to "Unknown"
    and pages to 0.

    3.Create objects using constructor and display  the values.

    */


    public static void main(String[] args) {

        Book bookObj = new Book();

        System.out.println("Book Title: " + bookObj.bookTitle.toLowerCase());
        System.out.println("Book Title: " + bookObj.bookTitle.toUpperCase());
        System.out.println("Pages: " + bookObj.pages);
    }
}
