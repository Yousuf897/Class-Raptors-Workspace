package tek.week_6.day_3;

public class Runner {

    public static void main(String[] args) {

        Vehicle veObj = new Vehicle();

        veObj.companyName = "BMW";
        veObj.vehicleModel = "X7";
        veObj.numberOfDoors = 4;
        veObj.printVehicleDetails();

        System.out.println(" * * * * *  * * * * *  * * * * *  * * * * *  * * * * * ");

        PersonalInformation prInObj = new PersonalInformation();

        prInObj.firstName = "Alex";
        prInObj.lastName = "Alexander";
        prInObj.printPersonalInfo();

        System.out.println(" * * * * *  * * * * *  * * * * *  * * * * *  * * * * * ");

        PersonalInformation prInObjTwo = new PersonalInformation();

        prInObjTwo.firstName = "Tony";
        prInObjTwo.lastName = "Eagle";
        prInObjTwo.printPersonalInfo();

    }
}
