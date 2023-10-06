package tek.week_6.day_3;

public class MethodExampleThree {

    public static void main(String[] args) {

        String[] names = {"Alex", "Bob", "Tony", "Tek", "School"};
        String[] countryNames = {"Frnace", "United States", "Netherlands", "India"};

/*      printArray(names);
        printArray(countryNames);*/

        printEvenNumbers();

        System.out.println();

        System.out.println("* * * * * * * * * * * * * * ");

        printEvenNumbers(10, 20);

        printArrayName();
    }

    public static void printArray(String[] array) {
        for (String value : array) {
            System.out.println(value + " ");
        }
    }

    // Create a method that is going to print even numbers from 1 to 10!

    public static void printEvenNumbers() {
        for (int number = 1; number <= 10; number++) {
            if (number % 2 == 0)
                System.out.print(number + " ");
        }
    }

    public static void printEvenNumbers(int start, int end ) {
        for (int number = start; number <= end; number++) {
            if (number % 2 == 0)
                System.out.print(number + " ");
        }
    }

    public static void printArrayName() {
        String[] names = {"Alex", "Bob", "Tony", "Tek", "School"};
        for (String value : names) {
            System.out.println(value + " ");
        }
    }
}
