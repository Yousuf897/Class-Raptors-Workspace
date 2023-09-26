package tek.week_4.day_3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int userAge;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        userAge = input.nextInt();
        if(userAge <= 12){
            System.out.println("you are a child");
        } else if (userAge >= 13 && userAge <= 19) {
            System.out.println("You are a Teenager!");
        } else {
            System.out.println("You are an adult");
        }
    }
}
