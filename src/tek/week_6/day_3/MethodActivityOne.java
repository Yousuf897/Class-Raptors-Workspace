package tek.week_6.day_3;

public class MethodActivityOne {

    public static void main(String[] args) {

        MorningRoutine morObj = new MorningRoutine();
        Greetings grObj = new Greetings();
        PersonalGreeting prGreObj = new PersonalGreeting();

        grObj.printWelcome();

        PersonalGreeting.sayHello("Java!");

        morObj.wakeUp();
        morObj.brushTeeth();
        morObj.haveBreakfast();
    }

}
