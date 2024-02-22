package tek.review.day_2;

public class AnimalRunner {

    public static void main(String[] args) {

        var dogObj = new Dog();
        var catObj = new Cat();
        var animalObj = new Animal();

        dogObj.makeSound();
        catObj.makeSound();

        final int number = 20;
        System.out.println(number);
    }
}
