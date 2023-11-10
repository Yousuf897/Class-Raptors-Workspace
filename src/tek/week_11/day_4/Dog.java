package tek.week_11.day_4;

public class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("Dog is eating!");
    }

    @Override
    public void makeSound() {
        System.out.println("Bark!");
    }

}
