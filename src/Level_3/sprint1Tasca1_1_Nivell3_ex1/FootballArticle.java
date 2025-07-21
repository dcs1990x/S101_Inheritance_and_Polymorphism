package Level_3.sprint1Tasca1_1_Nivell3_ex1;

public class FootballArticle extends Article {

    private String competition;
    private String club;
    private String player;

    public FootballArticle(String headline, String competition, String club, String player) {
        super(headline);
        this.competition = competition;
        this.club = club;
        this.player = player;
    }

    public String getCompetition(){
        return this.competition;
    }

    public String getClub(){
        return this.club;
    }

    public String getPlayer(){
        return this.player;
    }

    @Override
    public int calculatePrice() {
        final int BASE_PRICE = 300;
        int totalPrice = BASE_PRICE;

        if (this.competition.equalsIgnoreCase("Champions League")) {
            totalPrice += 100;
        }
        if (this.club.equalsIgnoreCase("Barça") || this.club.equalsIgnoreCase("Madrid")) {
            totalPrice += 100;
        }
        if (this.player.equalsIgnoreCase("Ferran Torres") || this.player.equalsIgnoreCase("Benzema")) {
            totalPrice += 50;
        }
        return totalPrice;
    }

    @Override
    public int calculateScore() {
        final int BASE_SCORE = 5;
        int totalScore = BASE_SCORE;

        if (this.competition.equalsIgnoreCase("Champions League")) {
            totalScore += 3;
        }
        else if (this.competition.equalsIgnoreCase("Lliga")) {
            totalScore += 2;
        }
        if (this.club.equalsIgnoreCase("Barça") || this.club.equalsIgnoreCase("Madrid")) {
            totalScore += 1;
        }
        if (this.player.equalsIgnoreCase("Ferran Torres") || this.player.equalsIgnoreCase("Benzema")) {
            totalScore += 1;
        }
        return totalScore;
    }

    @Override
    public String toString() {
        return "\n\tFootball {" + super.toString()
                + ", Competition: " + this.competition + ", Club: " + this.club + ", Player: "
                + this.player + "}";
    }
}