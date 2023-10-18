package tek.week_8.Day_2;

public class Runner {

/*
     Create a Parent class called Device
     Add some properties to the parent class
     Create a subclass for the Device and name is smartPhone
     Create another subclass for Device and name it Laptop
     Add properties to both subclass classes
     Create object of one of the subclasses and access the members of parent class!
 */

    public static void main(String[] args) {
        /*SmartPhone smartObj = new SmartPhone();
        Laptop lapObj = new Laptop();*/

        Motorcycle motObj = new Motorcycle();

        motObj.startEngine();
//      motObj.stopEngine();
        motObj.displayMotor();

    }

}
