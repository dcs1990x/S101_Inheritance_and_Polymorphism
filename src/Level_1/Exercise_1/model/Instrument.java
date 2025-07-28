package Level_1.Exercise_1.model;

public abstract class Instrument {

    private String name;
    private double price;

    public String getName(){
        return this.name;
    }

    public double getPrice(){
        return this.price;
    }

    static {
        System.out.println("Instrument class loaded through static initialization block. \n");
    }

    {
        System.out.println("Instrument class loaded through instance initialization block. \n");
    }

    public Instrument(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract String play();
}