package tek.week_7.day_2;

import tek.week_7.day_1.Employee;

public class Runner {

/*
     Activity first:

     Create a class called Calculator
     Declare two Instance variable called numberOne and numberTwo;

     Create two methods, one to calculate sum of two numbers and the other to calculate the multiplication of two numbers
     Create the object of Calculator class in Runner class
     Initialize the values of numberOne and numberTwo

     call the sum and the multiplication method and print the result of calculation!

     */


    public static void main(String[] args) {

/*        Calculator calObj = new Calculator();

        calObj.getUserInput();

        calObj.printSumOfTwoNumbers();
        calObj.printMultiOfTwoNumbers();*/

        // Creating the object of the employee class

        EmployeeExample empObj = new EmployeeExample();

 /*       empObj.firstName = "Bob";

        empObj.lastName;
        empObj.age;*/

//        System.out.println(empObj.getFirstName());

        empObj.setFirstName("Tony");
        empObj.setLastName("Alexander");
        empObj.setAge(25);


        empObj.printInfo();




    }



}
