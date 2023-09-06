package tek.week_2.day1;

public class StringMethods {

/*    2. Length: Finding out how many characters are in a string.
         String str = "Hello";
    int len = str.length(); // 5

    3. toUpperCase() = change the values to upper case letters.

    4. toLowerCase() = change the values to lower case letters.

    5. Substring: Extracting a portion of a string.

        String str = "Hello World";
        String sub = str.substring(0, 5); // "Hello"

    6. Replacement: Replacing specific parts of a string with another.
            String str = "Hello World";
            String replaced = str.replace("World", "Java"); // "Hello Java"

    7.  Trimming: Removing whitespace from the beginning and end of a string.
        String str = "   Hello World   ";
        String trimmed = str.trim(); // "Hello World"

    8. Searching: Checking if a string contains a specific sequence of characters or
    finding the position of a sequence.

        String str = "Hello World";
        boolean contains = str.contains("World"); // true
    */



    public static void main(String[] args) {
        // Working with the .length() method
        String message = "Hello Java";
        System.out.println("Length of the message: " + message.length());
        // Or
        String firstName = "Maria";
        System.out.println("length of the first name: " + firstName.length());
        System.out.println("The value of the message: " + message);

        // working with the toUpperCase()
        System.out.println("Upper case version of the message: " + message.toUpperCase());
        // working with the toLowerCase()
        System.out.println("Lower case version of the message: " + message.toLowerCase());

        // Working with the SubString method
        System.out.println("from index 0 all the way to index 5: " + message.substring(1,5));
        String tek = "Tek School";
        System.out.println(tek.substring(0,3));
        System.out.println(tek.substring(3));

        // Working with replace method
        System.out.println(tek.replace("School", "Virginia"));


        // Working with the trim() method
        String lastName = "            Bob                     ";
        System.out.println(lastName);
        System.out.println(lastName.trim());

        // Working with the contains()
        String middleName = "Bob Martinez Taylor";
        System.out.println(middleName.contains("Taylor"));

        String str = "         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        System.out.println(str);
    }
}
