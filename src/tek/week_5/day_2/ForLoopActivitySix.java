package tek.week_5.day_2;

public class ForLoopActivitySix {

    public static void main(String[] args) {
        // Print "TekSchool" 15 times!

//        for (int i = 1; i <= 15; i++) {
//            System.out.println( i  + ". TekSchool");
//        }

        int[] numbers = {10, 15, 14, 20, 25, 26, 60};

        for (int index = 0; index <= numbers.length - 1; index++) {
            System.out.println("At index " + index + " we have " + numbers[index]);
        }
    }
}
