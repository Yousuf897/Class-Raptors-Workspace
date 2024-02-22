package tek.review.day_2;

public class Cat implements AnimalInterface {

    @Override
    public void makeSound() {
        System.out.println("Meo!");
    }

    @Override
    public void eat() {
        System.out.println("cat is eating!");
    }
}
