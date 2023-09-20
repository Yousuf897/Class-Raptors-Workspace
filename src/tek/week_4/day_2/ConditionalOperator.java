package tek.week_4.day_2;

public class ConditionalOperator {

    /*
    *          Imagine you're looking at two boxes of crayons. One box has 5 crayons, and the other has 8
    *          crayons. You decide that you'll choose the box that has more crayons.
    *
    *          The conditional (ternary) operator is like making a quick choice between two options.
    *           It follows this format:

                 Syntax:
                condition ? option1 : option2;

         If the condition is true, you pick option1. If it's false, you pick option2.

    * */


    public static void main(String[] args) {
/*        int boxOne, boxTwo;
        boxOne = 30;
        boxTwo = 20;

        if (boxOne < boxTwo) {
            System.out.println("The largest box is boxTwo!");
        } else {
            System.out.println("The smallest box is boxTwo!");
        }*/

        // one line of code we can simplify this logic!

        int numberOne, numberTwo, max;

        numberOne = 150;
        numberTwo = 100;

        if (numberOne > numberTwo) {
            max = numberOne;
        } else {
            max = numberTwo;
        }

        System.out.println("The maximum values is: " + max);

        // How to use the conditional operator in order to simplify this logic!

        max = (numberOne > numberTwo) ? numberOne : numberTwo;

        System.out.println("The maximum values is: " + max);



    }

}
