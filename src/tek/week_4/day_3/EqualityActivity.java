package tek.week_4.day_3;

public class EqualityActivity {
    /*
    * Apple Comparison

    You have two apples with weights: double apple1Weight = 150.0; and double apple2Weight = 155.5;.
    Compare the weights of the two apples.
    Determine:
        If the weights are the same.
        If the weights are different.
    Print out the results of your comparisons.
    *
    * */
    public static void main(String[] args) {
      // ! = -> != =
        // ! =
        // !( firstName.equals(lastName) );

        boolean areWeightsSame, notWeightsSame;

        double apple1Weight = 150.0;
        double apple2Weight = 155.5;

        areWeightsSame = apple1Weight == apple2Weight;
        notWeightsSame = apple1Weight != apple2Weight;

        System.out.println("Result: " + areWeightsSame);
        System.out.println("Result: " + notWeightsSame);

    }
}
