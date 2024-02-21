package tek.review.day_1;

public class BuiltInMethods {

    public static void main(String[] args) {
        String message = "Welcome to TekSchool";
        String reverse = "";

        System.out.print( message.length());

        System.out.println( message.substring(2) );
        System.out.println( message.substring(2, 6) );


        for (int i = message.length() - 1; i >= 0; i--) {
            System.out.print(message.charAt(i));
        }


        System.out.println();

        StringBuffer sb = new StringBuffer(message);
        sb.reverse();

        System.out.println(sb);


        System.out.println();

        StringBuilder stbuilder = new StringBuilder(message);
        stbuilder.reverse();

        System.out.println(stbuilder);

    }

}
