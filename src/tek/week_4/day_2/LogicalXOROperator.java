package tek.week_4.day_2;

public class LogicalXOROperator {
    /*
    * 3. XOR (^): Exactly one condition must be true, not both.

        true ^ true = false
        true ^ false = true
        false ^ true = true
        false ^ false = false
    * */

    /*  // USING THE OR LOGICAL OPERATOR

    *  true || true = true
        true || false = true
        false || true = true
        false || false = false
    * */

    public static void main(String[] args) {
        String color1 = "Red";
        String color2 = "Red";
        String favoriteColor;

        favoriteColor = (color1.equals("Red") || color2.equals("Red")) ? color1 : color2;

        System.out.println("My favoriteColor is: " + favoriteColor);


        System.out.println(color1.equals("Red") || color2.equals("Red"));
        System.out.println(color1.equals("Red") ^ color2.equals("Red"));
    }
}
