package tek.week_8.Day_3;

public class Vehicle {

    private String model;
    private int year;
    private String company;

    public String getModel() {return model;}

    public void setModel(String model) {this.model = model;}

    public int getYear() {return year;}

    public void setYear(int year) {this.year = year;}

    public String getCompany() {return company;}

    public void setCompany(String company) {this.company = company;}

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", company='" + company + '\'' +
                '}';
    }

    public Vehicle(String model, int year, String company) {
        setModel(model);
        setYear(year);
        setCompany(company);
    }

    void turnOn() { System.out.println("Vehicle is turned on!"); }

    void turnOff() { System.out.println("Vehicle is turned off!"); }

}
