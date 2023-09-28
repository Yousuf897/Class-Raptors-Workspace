package tek.week_5.day_3;

public class StringSplitMethodActivityTwo {
    public static void main(String[] args) {
        int count;
        String phoneNumber = "111-222-333";
        String[] numbers = phoneNumber.split("-");

        for (String number : numbers) {
            System.out.println(number);
        }

        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * ");

        for (int index = 0; index < numbers.length; index++) {
            System.out.println(numbers[index]);
        }


    }
}
