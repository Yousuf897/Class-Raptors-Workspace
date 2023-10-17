package tek.week_8.day_1;

public class Smartphone extends Device{

    String operatingSystem, screenSize, cameraResolution;

    public void takePhoto() {
        turnOn();
        System.out.println("Taking a [" + cameraResolution + "] MP photo with the ["+ brand +"] [" + model +"]");
        turnOff();
    }
}
