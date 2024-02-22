package tek.review.day_2;

public class StudentAddress extends Student {

    String address;

    public StudentAddress(String firstName, String address) {
        super(firstName);
        this.address = address;
    }

    public void printStudentAddress() {
        System.out.println("Student Name: " + firstName + " Address: " + address);
    }
}
