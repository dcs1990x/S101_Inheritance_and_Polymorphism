package Level_2.Exercise_1.model;

public class RunMain {

    public static void run() {

        Smartphone mobilePhone = new Smartphone("OnePlus", "Nord 100");

        mobilePhone.call("123456789");
        mobilePhone.takePicture();
        mobilePhone.triggerAlarm();
    }
}