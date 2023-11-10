package tek.week_11.day_4;

public class Runner {

    public static void main(String[] args) {

        Car car = new Car(); // Child class -> SubClass
        Trucks trucks = new Trucks(); // Second child class -> SubClass
        Vehicle vehicle = car; // Parent class -> SuperClass -> Upcasting

        // Methods
        vehicle.printVehicleModel();
        vehicle.printVehicleNumberOfDoors();

        // Object of the child class
        car.carModel();
        car.printCar();
        car.printVehicleModel();
        car.printVehicleNumberOfDoors();


/*        vehicle.*/





    }

}
