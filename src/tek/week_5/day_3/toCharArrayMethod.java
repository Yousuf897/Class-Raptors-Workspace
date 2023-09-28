package tek.week_5.day_3;

public class toCharArrayMethod {
    public static void main(String[] args) {
        int count = 0;
        String message = " Welcome to TekSchool";
        char[] characters = message.toCharArray();

        for (char character : characters) {
            count++;
            System.out.println(character);

        }

//        String secondMessage = "ABCDE";
//        System.out.println("We have " + secondMessage.length() + " Characters!");

        // how to get the count or the length of the array
        System.out.println("Total characters: " + characters.length);
        System.out.println("Total characters: " + count);
    }
}
