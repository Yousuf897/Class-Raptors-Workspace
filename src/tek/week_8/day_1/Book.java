package tek.week_8.day_1;

public class Book {

    String title;
    String author;
    int numberOfPages;

    public void read() {
        System.out.println("Reading [" + title + "] by [" + author + "].");
    }

    public void close() {
        System.out.println("Closing the book.");
    }

}
