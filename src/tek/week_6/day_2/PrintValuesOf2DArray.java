package tek.week_6.day_2;

public class PrintValuesOf2DArray {


    public static void main(String[] args) {

/*        String[] names = { "Bob", "Chely", "Mike", "Tony", "Alex"};

        for (String name : names ) {

            if (name.equals("Chely")) {
                System.out.println("We have found: " + name);
                break;
            }
        }*/

        // How to print the values from 2D array!

        String[][] twoNames = {

            { "Bob", "Chely", "Alex", "Eric", "Eric", "Eric", "Eric", "Eric", "Eric", "Eric", "Eric",},

            { "Tony"},

            { "Eric", "Eric", "Eric", "Eric", "Eric", "Eric",},

            { "Bob", "Chely", "Alex" ,"Eric", "Eric", "Eric",},

           { "Bob", "Chely", "Alex", "Eric", "Eric", "Eric", "Eric", "Eric", "Eric", "Eric", "Eric",},

            { "Bob", "Chely", "Alex", "Eric", "Eric"},

            { "Bob", "Eric", "Eric", "Eric", "Eric", "Eric",},

        };

        for (int row = 0; row < twoNames.length; row++) {
            for (int col = 0; col < twoNames[row].length; col++) {
                System.out.print(twoNames[row][col] + " ");
            }
            System.out.println();
        }


    }
}
