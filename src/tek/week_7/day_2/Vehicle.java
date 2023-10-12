package tek.week_7.day_2;

public class Vehicle {

    String color;
    int numberOfDoors;
    String model;
    int year;
    String make;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public Vehicle(String color, int numberOfDoors, String model, int year, String make) {
        setColor(color);
        setNumberOfDoors(numberOfDoors);
        setModel(model);
        setYear(year);
        setMake(make);
    }

    public void printVehicleInfo() {
        System.out.println("Color: " + color);
        System.out.println("Number of Doors: " + numberOfDoors);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Make: " + make);
    }


}
