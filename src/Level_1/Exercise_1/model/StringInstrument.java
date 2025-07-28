package Level_1.Exercise_1.model;

public class StringInstrument extends Instrument {

    public StringInstrument (String name, double price) {
        super(name, price);
    }

    static {
        System.out.println("String class loaded through static initialization block. \n");
    }

    {
        System.out.println("String class loaded through instance initialization block. \n");
    }

    @Override
    public String play() {
        return "A string instrument is playing. ";
    }

    public static String play = "A string instrument is playing. ";
}