package tek.week_8.day_1;

public class AudioBook extends Book {

    int durationInHours;
    String narrator;

    public void listen() {
        System.out.println("Listening to [" + title + "] narrated by [" + narrator + "].");
        read();
    }

}
