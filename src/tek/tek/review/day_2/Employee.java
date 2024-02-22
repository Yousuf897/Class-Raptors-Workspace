package tek.review.day_2;

public class Employee {

    public String firstName;

    public Employee(String firstName) {
        setFirstName(firstName);
    }

    private String getFirstName() {
        return firstName;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void printFirstName() {
        System.out.println("First Name: " + firstName );
    }

}
