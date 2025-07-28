package Level_1.Exercise_2.model;

public class Car {

    private static final String BRAND = "Honda";
    private static String model;
    private final int POWER;

    public Car(String model, int power) {
        // this.BRAND = "Honda";
        Car.model = model;
        this.POWER = power;
    }

    public static String getBrand(){
        return BRAND;
    }

    public static String getModel(){
        return model;
    }

    public int getPOWER(){
        return this.POWER;
    }

    public void setModel(String model) {
        Car.model = model;
    }

    public static void brake() {
        System.out.println("The vehicle is braking.");
    }

    public void accelerate() {
        System.out.println("The vehicle is accelerating.");
    }
}