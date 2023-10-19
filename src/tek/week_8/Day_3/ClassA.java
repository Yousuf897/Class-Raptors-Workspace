package tek.week_8.Day_3;

/*final*/ class ClassA {

    String name;
    String lastName;
    int age;

    ClassA(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

     final void printName() {
        System.out.println("Value of name: " + name);
    }

}
