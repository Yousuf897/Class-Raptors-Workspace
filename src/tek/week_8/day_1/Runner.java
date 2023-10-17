package tek.week_8.day_1;

public class Runner {

    public static void main(String[] args) {

        AudioBook audObj = new AudioBook();

        // setting the properties of child class.
        audObj.durationInHours = 8;
        audObj.narrator = "Bob";

        // setting the properties of the parent class.
        audObj.title = "Learning Java";
        audObj.author = "TekSchool";
        audObj.numberOfPages = 5;

        // Calling the methods from both the parent and child class through the child object!
        audObj.listen();
        audObj.close();

        //       - * - * - *  - * - * - *  - * - * - *  - * - * - *  - * - * - *  - * - * - *

        Smartphone smartObj = new Smartphone();

/*        // Set the properties of the child class.
        smartObj.operatingSystem = "IOS";
        smartObj.screenSize = "5.7";
        smartObj.cameraResolution = "12";

        // Set the properties of the parent class.

        smartObj.brand = "Apple";
        smartObj.model = "14 pro max";
        smartObj.powerSupply = "Battery";

        // Calling the methods from both parent and the child class
        smartObj.takePhoto();
//        smartObj.turnOff();*/
    }
}
