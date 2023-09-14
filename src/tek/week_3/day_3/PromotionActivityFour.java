package tek.week_3.day_3;

public class PromotionActivityFour {

    /*Question 4: Mixed Integer and Floating Point Promotion

    Consider two variables: int n = 15; and float z = 4.5f;.
    Predict the data type of the result when you divide n by z.
    Which variable undergoes automatic promotion during this operation?
    Calculate the division result and store it in a suitable data type. What is the final value?*/

    public static void main(String[] args) {
        int n = 15;
        float z = 4.5f;
        float result = n / z;
        System.out.println(result);

        result = n / (int) z;
        // or
        result = (int) (n / z);
    }
}
