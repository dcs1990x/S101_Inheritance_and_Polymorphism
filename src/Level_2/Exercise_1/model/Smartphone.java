package Level_2.Exercise_1.model;

public class Smartphone extends Telephone implements Camera, Clock {

    public Smartphone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void takePicture() {
        System.out.println("Taking a picture... ");
    }

    @Override
    public void triggerAlarm() {
        System.out.println("The alarm went off. ");
    }
}