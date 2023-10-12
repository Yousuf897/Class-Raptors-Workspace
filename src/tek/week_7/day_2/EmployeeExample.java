package tek.week_7.day_2;

public class EmployeeExample {

    private String firstName;
    private String lastName;
    private int age;

    public EmployeeExample() {
        firstName = "";
        lastName = "";
        age = 0;
    }

    // Getter for the firstName
    public String  getFirstName() {
        return firstName;
    }

    // Setter for the firstName
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printInfo() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
    }
}
