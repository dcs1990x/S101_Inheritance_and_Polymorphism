package Level_3.Exercise_1.model;

public class BasketballArticle extends Article {

    private String competition;
    private String club;

    public BasketballArticle(String headline, String competition, String club) {
        super(headline);
        this.competition = competition;
        this.club = club;
    }

    public String getCompetition(){
        return this.competition;
    }

    public String getClub(){
        return this.club;
    }

    @Override
    public int calculatePrice() {
        final int BASE_PRICE = 250;
        int totalPrice = BASE_PRICE;

        if (this.competition.equalsIgnoreCase("Euroligue")) {
            totalPrice += 75;
        }
        if (this.club.equalsIgnoreCase("Barça") || this.club.equalsIgnoreCase("Madrid")) {
            totalPrice += 75;
        }
        return totalPrice;
    }

    @Override
    public int calculateScore() {
        final int BASE_SCORE = 4;
        int totalScore = BASE_SCORE;

        if (this.competition.equalsIgnoreCase("Euroligue")) {
            totalScore += 3;
        } else if (this.competition.equalsIgnoreCase("ACB")) {
            totalScore += 2;
        }
        if (this.club.equalsIgnoreCase("Barça") || this.club.equalsIgnoreCase("Madrid")) {
            totalScore += 1;
        }
        return totalScore;
    }

    @Override
    public String toString() {
        return "\n\tBasketball {" + super.toString()
                + ", Competition: " + this.competition + ", Club: " + this.club + "}";
    }
}