package tek.week_3.day_3;

public class PromotionActivityFive {

    /*
* Question 5: Byte and Short Promotion

Start with two variables: byte b1 = 3; and short s1 = 4;.
If you subtract b1 from s1, what would be the data type of the result?
Are there any automatic promotions? If yes, which variables are promoted?
Perform the subtraction and store the result in a suitable data type. What is the final value?  */
    public static void main(String[] args) {

        byte b1 = 3;
        short s1 = 4;

        int result = b1 - s1;
        System.out.println(result);

    }
}
