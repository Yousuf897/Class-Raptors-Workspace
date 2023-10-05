package tek.week_6.day_2;

public class BreakActivityOne {

    public static void main(String[] args) {

        // Consider this array of String
        // String[] names = { "Bob", "Chely", "Mike", "Tony", "Alex"};

        // Loop through this array, when the value is = chely -> STOP
        // Print the name!

        String[] names = { "Bob", "Chely", "Mike", "Tony", "Alex"};

        for (String name : names ) {

            if (name.equals("Chely")) {
                System.out.println("We have found: " + name);
                break;
            }
        }

        // print the index of the name in which you have found

        for (int index = 0; index < names.length; index++) {
            if (names[index].equals("Bob")) {
                System.out.println("We have found " + names[index] + " at index number: " + index );
                break;
            }
        }

        String [] name = {"Bob", "Chely", "Mike", "Tony", "Alex"};
        for (int i = 0; i < name.length ; i++ )  {
            if (name[i].equals("Chely")) {
                System.out.println("Found the Name " + name[i]);
                break;
          }
        }

    }
}
