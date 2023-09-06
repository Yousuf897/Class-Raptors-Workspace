package tek.week_2.day1;

public class Operators {

    // Operators are like the verbs of programming. They describe actions or relationships.
    // In Java, operators are used to perform operations on variables and values.

/*      1. Arithmetic Operators:

         These are like the basic operations you do with a calculator.

        A. + (Addition): Imagine you have two baskets of apples. If one basket has 3 apples and the other
        has 4, combining them (3 + 4) gives you 7 apples.

        B.     * (Multiplication): If you have 5 baskets, each with 3 apples,
                you have a total of (5 * 3) 15 apples.

        C. - (Subtraction): If you eat 2 apples from your basket of 7, you're left with (7 - 2) 5 apples.

       D.   / (Division): If you divide your 15 apples equally among 3 friends, each friend gets (15 / 3) 5 apples.

       E.     % (Modulus - remainder): This one is like asking, "If I divide these apples among friends,
             how many will be left over for me?" If you have 7 apples and divide them between 3 friends,
            each friend gets 2, and you're left with (7 % 3) 1 apple.
    */


    public static void main(String[] args) {

        // Addition Operator ( + )
        int numberOne, numberTwo, result;
        numberOne = 100;
        numberTwo = 150;
        result = numberOne + numberTwo;
        System.out.println(result);
        // or
        System.out.println(numberOne + numberTwo);
        System.out.println(100 + 150);
        System.out.println(result + 200);

        System.out.println("-----------------------------------------------------");

        // Multiplication Operator ( * )
        int numOne, numTwo, resultOfMultiplication;
        numOne = 100;
        numTwo = 150;
        resultOfMultiplication = numOne * numTwo;
        System.out.println(resultOfMultiplication);
        // or
        System.out.println(numOne * numTwo);

        System.out.println(100 * 150);

        System.out.println(resultOfMultiplication * 200);

        System.out.println("-----------------------------------------------------");

        // Subtraction Operator ( - )
        int numOneSub, numTwoSub, resultOfSubtraction;
        numOneSub = 100;
        numTwoSub = 150;
        resultOfSubtraction = numOneSub - numTwoSub;
        System.out.println(resultOfSubtraction);
        // or
        System.out.println(numOneSub - numTwoSub);

        System.out.println(100 - 150);

        System.out.println(resultOfSubtraction - 200);

        System.out.println("-----------------------------------------------------");

        // Division Operator ( / )
        int numOneDiv, numTwoDiv, resultOfDivision;
        numOneDiv = 100;
        numTwoDiv = 150;
        resultOfDivision = numOneDiv / numTwoDiv;
        System.out.println(resultOfDivision);
        // or
        System.out.println(numOneDiv / numTwoDiv);

        System.out.println(100 / 150);

        System.out.println(resultOfDivision / 200);
    }
}
