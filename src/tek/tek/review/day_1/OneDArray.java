package tek.review.day_1;

public class OneDArray {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        int arrayValue = 10;

        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = arrayValue++ + 10;
        }

        for (int number : numbers ) {
            System.out.println(number);
        }

        int[] arrayOfNumbers = {10, 20, 30, 40, 50};

        String[][] studentNames = new String[5][3];

    }
}
