package Level_3.Exercise_1.util;

import java.util.Scanner;
import static Level_3.Exercise_1.util.EditorManager.editors;

public class ArticleManager {

    public static int calculateArticlePrice(Scanner scanner) {
        System.out.print("Enter the article's headline: ");
        String headline = scanner.nextLine();

        int price = 0;
        for (var editor : editors) {
            for (var article : editor.getArticles()) {
                if (headline.equalsIgnoreCase(article.getHeadline())) {
                    price = article.calculatePrice();
                }
            }
        }
        return price;
    }

    public static int calculateArticleScore(Scanner scanner) {
        System.out.print("Enter the article's headline: ");
        String headline = scanner.nextLine();

        int score = 0;
        for (var editor : editors) {
            for (var article : editor.getArticles()) {
                if (headline.equalsIgnoreCase(article.getHeadline())) {
                    score = article.calculateScore();
                }
            }
        }
        return score;
    }
}
