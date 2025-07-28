package Level_3.Exercise_1.model;

public abstract class Article {

    private String headline;
    private String content;
    private int score;
    private int price;

    public Article(String headline) {
        this.headline = headline;
        this.content = "";
    }

    public String getHeadline(){
        return this.headline;
    }

    public String getContent(){
        return this.content;
    }

    public int getScore(){
        return this.score;
    }

    public int getPrice(){
        return this.price;
    }

    public abstract int calculatePrice();

    public abstract int calculateScore();

    @Override
    public String toString() {
        return "Headline: " + this.headline + ", Content: " + this.content
                + ", Score: " + this.calculateScore() + ", Price: " + this.calculatePrice() + "€";
    }
}