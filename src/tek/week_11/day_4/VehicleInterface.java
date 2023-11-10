package tek.week_11.day_4;

public interface VehicleInterface {

     void startEngine();

     void stopEngine();

/*     default void printName() { System.out.println("Print a name!") };*/

    // default method
    default void printName() {

    }

    // static method
    static void printModel() {
        System.out.println("Static method implmentation");
    }

    int name = 20;
/*    name = 50;*/
}
