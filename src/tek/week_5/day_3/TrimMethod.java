package tek.week_5.day_3;

public class TrimMethod {

    public static void main(String[] args) {
        String message = "Welcome to TekSchool                     ";
        System.out.println("Original Message: " + message);

        // How to remove the extra space
        System.out.println("Trimed version: " + message.trim());
    }
}
