package Level_3.Exercise_1.model;

public class F1Article extends Article {

    private String team;

    public F1Article(String headline, String team) {
        super(headline);
        this.team = team;
    }

    public String getTeam(){
        return this.team;
    }

    @Override
    public int calculatePrice() {
        final int BASE_PRICE = 100;
        int totalPrice = BASE_PRICE;

        if (this.team.equalsIgnoreCase("Ferrari") || this.team.equalsIgnoreCase("Mercedes")) {
            totalPrice += 50;
        }
        return totalPrice;
    }

    @Override
    public int calculateScore() {
        final int BASE_SCORE = 4;
        int totalScore = BASE_SCORE;

        if (this.team.equalsIgnoreCase("Ferrari") || this.team.equalsIgnoreCase("Mercedes")) {
            totalScore += 2;
        }
        return totalScore;
    }

    @Override
    public String toString() {
        return "\n\tFormula 1 {" + super.toString() + ", Team: " + this.team + "}";
    }
}