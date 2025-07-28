package Level_1.Exercise_1.model;

public class PercussionInstrument extends Instrument {

    public PercussionInstrument (String name, double price) {
        super(name, price);
    }

    static {
        System.out.println("Percussion class loaded through static initialization block. \n");
    }

    {
        System.out.println("Percussion class loaded through instance initialization block. \n");
    }

    @Override
    public String play() {
        return "A percussion instrument is playing. ";
    }

    public static String play = "A percussion instrument is playing. ";
}