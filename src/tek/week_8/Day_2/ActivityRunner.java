package tek.week_8.Day_2;

public class ActivityRunner {

    public static void main(String[] args) {

        // Creating objects for both the teacher and the Janitor classes.
        Teacher teObj = new Teacher();
        Janitor jaObj = new Janitor();

        // Initializing the properties of both child and the parent class through the object of teacher.
        teObj.name = "Bob";
        teObj.designation = "Math Teacher";
        teObj.subject = "Math";

        // Calling the method from both the parent and child classes!
        teObj.displayDetails();
        teObj.teachSubject();

        // Initializing the properties of both child and the parent class through the object of janitor.
        jaObj.name = "Lydia";
        jaObj.designation = "Janitor";
        // Calling the method from both the parent and child classes!
        jaObj.displayDetails();
        jaObj.cleanClassroom();

    }
}
