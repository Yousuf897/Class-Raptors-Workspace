package tek.review.day_2;

public class Dog implements AnimalInterface{

    @Override
    public void makeSound() {
        System.out.println("Bark!");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating!");
    }
}
