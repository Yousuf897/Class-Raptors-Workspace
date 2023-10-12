package tek.week_7.day_2;

public class VehicleRunner {

    public static void main(String[] args) {

        // Object of the first vehicle
        Vehicle vhObj = new Vehicle("White", 4, "Camry", 2024, "Toyota" );
        vhObj.printVehicleInfo();

        // Object of the second vehicle
        Vehicle vh2Obj = new Vehicle("Black", 2, "M4", 2024, "BMW" );
        vh2Obj.printVehicleInfo();

    }
}
