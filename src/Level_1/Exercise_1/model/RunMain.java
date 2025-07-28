package Level_1.Exercise_1.model;

public class RunMain {

    public static void run(){
        Instrument saxophone = new WindInstrument("Jackson BB", 6990.90);
        Instrument guitar = new StringInstrument("Gibson Les Paul", 12000);
        Instrument drums = new PercussionInstrument("Yamaha 3000", 3550.50);

        saxophone.play();

        guitar.play();

        drums.play();
    }
}