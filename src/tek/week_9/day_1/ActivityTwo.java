package tek.week_9.day_1;

public class ActivityTwo {

    public static void main(String[] args) {

        String name = "Bob";

        System.out.println(name.hashCode());

        String lastName = "Bob";

        System.out.println(lastName.hashCode());

        String middleName = new String("Bob").intern();

        System.out.println(middleName.hashCode());

        System.out.println(  name == lastName );
        System.out.println(  name == middleName );


    }
}
