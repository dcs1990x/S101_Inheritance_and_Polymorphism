package Level_1.sprint1Tasca1_1_Nivell1_ex1;

public class Main {

    public static void main(String[] args) {

        Instrument saxofone = new WindInstrument("Jackson BB", 6990.90);
        Instrument guitar = new StringInstrument("Gibson Les Paul", 12000);
        Instrument drums = new PercussionInstrument("Yamaha 3000", 3550.50);

        saxofone.play();

        guitar.play();

        drums.play();
    }
}