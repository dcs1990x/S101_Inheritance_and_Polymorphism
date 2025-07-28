package Level_3.Exercise_1.util;
import Level_3.Exercise_1.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static Level_3.Exercise_1.util.RunMain.scanner;

public class EditorManager {

    static final ArrayList<Editor> editors = new ArrayList<>();

    public static Editor findEditor(Scanner scanner) {
        System.out.print("\nEnter the editor's ID: ");
        String editorId = scanner.nextLine().trim().toLowerCase();

        for (var editor : editors) {
            if (editorId.equalsIgnoreCase(editor.getId().toLowerCase())) {
                return editor;
            }
        }
        throw new IllegalArgumentException("The entered ID does not match any in the list.");
    }

    public static void addEditor(Scanner scanner) {
        System.out.print("\nEnter editor's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter editor's ID: ");
        String id = scanner.nextLine().toUpperCase();

        Editor editor = new Editor(name, id);
        editors.add(editor);
        System.out.printf("Editor %s with ID %s has been added to the list.\n", editor.getName(), editor.getId());
    }

    public static void removeEditor() {
        Editor editor = findEditor(scanner);
        editors.remove(editor);
        System.out.printf("Editor %s with ID %s has been removed from the list.\n", editor.getName(), editor.getId());
    }

    public static void addArticleToEditor(Scanner scanner) {
        System.out.println("\nSelect the sport related to the article:");
        System.out.print(
                "1. Football" +
                        "2. Basketball" +
                        "3. Tennis" +
                        "4. F1" +
                        "5. Motorsports");
        int option = scanner.nextInt(); scanner.nextLine();

        System.out.print("\nEnter the article's headline: ");
        String headline = scanner.nextLine();

        Article article = null;
        if (option == 1) {
            System.out.print("\nEnter competition name: ");
            String competition = scanner.nextLine();
            System.out.print("Enter club name: ");
            String club = scanner.nextLine();
            System.out.print("Enter player name: ");
            String player = scanner.nextLine();
            article = new FootballArticle(headline, competition, club, player);
        }
        else if (option == 2) {
            System.out.print("\nEnter competition name: ");
            String competition = scanner.nextLine();
            System.out.print("Enter club name: ");
            String club = scanner.nextLine();
            article = new BasketballArticle(headline, competition, club);
        }
        else if (option == 3) {
            System.out.print("\nEnter competition name: ");
            String competition = scanner.nextLine();
            System.out.print("Enter player(s) name(s): ");
            String players = scanner.nextLine();
            article = new TennisArticle(headline, competition, players);
        }
        else if (option == 4) {
            System.out.print("\nEnter racing team name: ");
            String team = scanner.nextLine();
            article = new F1Article(headline, team);
        }
        else if (option == 5) {
            System.out.print("\nEnter racing team name: ");
            String team = scanner.nextLine();
            article = new MotorcyclingArticle(headline, team);
        }
        else {
            System.out.println("Invalid option.");
            return;
        }

        Editor editor = findEditor(scanner);
        editor.addArticle(article);
    }

    public static void removeArticle() {
        Scanner remScanner = new Scanner(System.in);
        System.out.print("Enter editor's name: ");
        String editorName = remScanner.nextLine();
        System.out.print("Enter the article's headline: ");
        String articleHeadline = remScanner.nextLine();

        for (var editor : editors) {
            if (editorName.equalsIgnoreCase(editor.getName())) {
                for (var article : editor.getArticles()) {
                    if (articleHeadline.equalsIgnoreCase(article.getHeadline())) {
                        editor.removeArticle(article);
                        return;
                    }
                }
                System.out.println("\nThe article is not in the editor's list.");
                return;
            }
        }
        System.out.println("\nEditor not found in the list.");
    }

    public static void showEditorArticles() {
        Editor editor = findEditor(scanner);
        List<Article> list = editor.getArticles();
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("\nThe list is empty.");
        }
    }
}
