package Level_2.sprint1Tasca1_1_Nivell2_ex1;

public class Telephone {

    private String brand;
    private String model;

    public Telephone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand(){
        return this.brand;
    }

    public String getModel(){
        return this.model;
    }

    public void call(String phoneNumber) {
        System.out.println("Calling the number " + phoneNumber + "... ");
    }
}