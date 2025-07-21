package Level_3.sprint1Tasca1_1_Nivell3_ex1;

import java.util.ArrayList;
import java.util.List;

public class Editor {

    private String name;
    private final String id;
    private static double salary;
    private ArrayList<Article> articles;

    public Editor(String name, String id) {
        this.name = name;
        this.id = id;
        this.articles = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public static double getSalary() {
        return salary;
    }

    public static void setSalary(double newSalary) {
        salary = newSalary;
    }

    public void addArticle(Article article) {
        articles.add(article);
    }

    public void removeArticle(Article article) {
        articles.remove(article);
    }

    public List<Article> getArticles() {
        return List.copyOf(articles);
    }

    @Override
    public String toString() {
        return "Editor {name: " + name +
                ", id: " + id +
                ", salary: " + salary +
                ", assigned articles: " + articles + "}\n";
    }
}