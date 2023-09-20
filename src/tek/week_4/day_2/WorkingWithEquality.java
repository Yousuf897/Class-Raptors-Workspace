package tek.week_4.day_2;

public class WorkingWithEquality {

    public static void main(String[] args) {

        String color1 = "Red";
        String color2 = "Blue";
        String color3 = "Red";

        System.out.println(color1 == color2);
        System.out.println(color1 == "Red");

        System.out.println(color1.hashCode());
        System.out.println(color2.hashCode());
        System.out.println(color3.hashCode());

        System.out.println(color1 == color3);


        String color4 = new String("Red");
        String color5 = new String("Red");

        System.out.println(color4.hashCode());

        System.out.println(color4 == color5);
        System.out.println(color4.equals(color5));


    }
}
