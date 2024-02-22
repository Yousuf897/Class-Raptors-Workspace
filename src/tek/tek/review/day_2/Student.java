package tek.review.day_2;

public class Student extends Employee {

    public Student(String firstName) {
        super(firstName);
    }

    public void printStudentName() {
        System.out.println("Student Name: " + firstName);
    }
}
