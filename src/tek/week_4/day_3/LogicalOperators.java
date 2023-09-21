package tek.week_4.day_3;

public class LogicalOperators {
    /*
    * Real-life analogy:
    *
     Imagine you are planning an outdoor picnic. For the picnic to be successful,
*    two conditions should ideally be met:

    The weather should be sunny.
    The temperature should be pleasant (not too hot or too cold).

    Your decision to go on with the picnic or postpone it will be based on these conditions.
    This is similar to using logical operators to evaluate multiple conditions.
    *
    * Java-related explanation:
    Logical operators are used to evaluate two or more conditions:

    && (Logical AND): Both conditions must be true for the entire expression to be true.
    || (Logical OR): At least one condition must be true for the entire expression to be true.
    ! (Logical NOT): Reverses the truth value of the condition.
    * */

    public static void main(String[] args) {
        boolean isTrue;
        int numberOne, numberTwo, numberThree, numberFour;

        numberOne = 10;
        numberTwo = 20;
        numberThree = 30;
        numberFour = 40;

        isTrue = (numberOne == numberTwo && numberThree == numberFour) ? true : false;

        if (numberOne == numberTwo && numberThree == numberFour)
            isTrue = true;
        else
            isTrue = false;

        System.out.println(isTrue);


        String firstName, lastName, middleName;

        firstName = "Taylor";
        lastName = "Taylor";
        middleName = "Taylor";

        // if firstName equal to lastName AND firstName == middleName -> Print true else -> print false
        if (firstName.equals(lastName) && (firstName.equals(middleName))) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        System.out.println((firstName.equals(lastName) && (firstName.equals(middleName)) ? "True" : "False"));



    }
}
