package tek.week_4.day_2;

public class LogicalORActivity {

    /*
*
* Question: Favorite Color Picker

You have two color options: String color1 = "Red"; and String color2 = "Blue";.
You like the color "Red" more than "Blue".
Using the conditional operator, determine which color is your favorite.
Store your favorite color in a variable called favoriteColor.
Print out your favorite color. What is the color?
*
*   to compare the color1 with Red or Color2 with Red
*
* */
    public static void main(String[] args) {
        String color1 = "Red";
        String color2 = "Blue";
        String favoriteColor;

        favoriteColor = (color1.equals("Red") || color2.equals("Red")) ? color1 : color2;

        System.out.println("My favoriteColor is: " + favoriteColor);
    }
}
