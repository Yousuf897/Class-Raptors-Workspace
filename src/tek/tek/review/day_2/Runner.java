package tek.review.day_2;

public class Runner {

    public static void main(String[] args) {

        var empOneObj = new Employee("Alex");
        var empTwoObj = new Employee("Eric");
        var studentOneObj = new Student("Trevor");
        var stdAddressObj = new StudentAddress("Erin", "United States");

        empOneObj.printFirstName();
        empTwoObj.printFirstName();
        studentOneObj.printStudentName();
        stdAddressObj.printStudentAddress();

    }
}
