package tek.week_3.day_3;

import java.sql.SQLOutput;

public class PromotionActivityTwo {
      /*  Question 2: Floating Point Promotion
      Consider two variables: float x = 5.5f; and double y = 10.5;.
      What would be the data type of the result when you multiply x and y?
      Which variable will be promoted automatically during the operation?
      Calculate the product and store it in a suitable data type. What is the value? */

    public static void main(String[] args) {
        float x = 5.5f;
        double y = 10.5;
        double result = x * y;
        System.out.println(result);
    }
}
