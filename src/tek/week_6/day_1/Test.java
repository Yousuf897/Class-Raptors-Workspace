package tek.week_6.day_1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number, start, end; System.out.println("enter the number that your multiplication want to start ");
        number = input.nextInt();

        System.out.println("put your start number ");
        start = input.nextInt(); System.out.println("put your end number ");
        end = input.nextInt();

        for (int i = start; i <= end; i++) {

            System.out.println(i + " * " + start + " = " + number * start);

         }

    }
}
