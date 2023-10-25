package tek.week_9.day_2;

public class ActivityOne {

/*    Superhero Nicknames:

    Create a StringBuilder with the value "SpiderMan".
    Insert a dash (-) to separate "Spider" and "Man".
    What's the output now?

    StringBuilder superhero = new StringBuilder("SpiderMan");
    superhero.insert(6, '-');
    System.out.println(superhero);  // Output: Spider-Man*/

    public static void main(String[] args) {

        StringBuilder superhero = new StringBuilder("Spider-Man");
        System.out.println(superhero);
        superhero.insert(6, '-');
        System.out.println(superhero);



    }

}
