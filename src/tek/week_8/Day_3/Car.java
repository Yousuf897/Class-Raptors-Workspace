package tek.week_8.Day_3;

public class Car extends Vehicle {

    private int numberOfDoors;

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public Car(String model, int year, String company, int numberOfDoors) {
        super(model, year, company);
        setNumberOfDoors(numberOfDoors);
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfDoors = " + numberOfDoors +
                '}';
    }

    void printNumOfDoors() { System.out.println("Number of doors for car: " + numberOfDoors); }


}
