package tek.week_9.day_1;

public class MutableStrings {

    public static void main(String[] args) {

        var sbf = new StringBuilder("Java");
        System.out.println(sbf);
        sbf.append(" is easy!");
        System.out.println(sbf);


        String str1 = "name";
        System.out.println( str1.concat("a message") );
    }

}
