package tek.week_9.day_3;

public class Animal {

    void makeSounds() {
        System.out.println("Animal is making a sound!");
    }

}

class Dog extends Animal{

    @Override
    void makeSounds() {
        System.out.println("Dog is making a sound!");
    }


}

class Cat extends Animal  {
    @Override
    void makeSounds() {
        System.out.println("Cat is making a sound!");
    }


}

class Runner {

    public static void main(String[] args) {

        var catObj = new Cat();

        catObj.makeSounds();

    }
}


