package tek.week_8.day_1;

public class Device {
    String brand;
    String model;
    String powerSupply;

    public void turnOn() {
        System.out.println("["+ brand +"] [" + model + "] is turning on.");
    }

    public void turnOff() {
        System.out.println("["+ brand +"] [" + model + "] is turning off.");
    }
}
