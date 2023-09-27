package tek.week_5.day_2;

public class ForEachLoop {
    /*
    * For-Each Loop (Enhanced For Loop)

Real-Life Analogy:

Imagine you have a basket of fruits: apple, banana, orange, and grape.
* Instead of picking a fruit by its position in the basket, you simply want to go through each
* fruit one by one. For each fruit you pick, you examine it and then move to the next one, until
* you've examined all the fruits in the basket.

Programming Explanation:

In Java, when you want to iterate over all the elements in an array or a collection without needing
* to know the index of the current item, you can use the for-each loop, also known as the enhanced for loop.
* It simplifies the syntax and avoids potential errors related to indices.

The structure of a for-each loop is:

for (Type variableName : arrayOrCollection) {
    // body of the loop
}
*
* Here's an example with an array of integers:

int[] numbers = {1, 2, 3, 4, 5};

for (int number : numbers) {
    System.out.println(number);
}

In this example, for each iteration, the value of the next element in the numbers
* array is assigned to the number variable, and then the body of the loop is executed.
    * */

    public static void main(String[] args) {
        int[] numbers = {10, 15, 14, 20, 25, 26, 60};

        for (int index = 0; index <= numbers.length - 1; index++) {
            System.out.println("At index " + index + " we have " + numbers[index]);
        }

        for (int tempNumber : numbers) {
            System.out.println(tempNumber);
        }

        String[] names = {"Bob", "Alex", "Tyolor", "Mike"};

        for (String name : names) {
            System.out.println(name);
        }
    }
}
