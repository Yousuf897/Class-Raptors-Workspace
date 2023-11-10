package tek.week_11.day_4;

public class Cat extends Animal {

    @Override
    public void eat() {
        System.out.println("cat is eating!");
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}
