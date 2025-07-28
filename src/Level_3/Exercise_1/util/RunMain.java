package Level_3.Exercise_1.util;

import java.util.Scanner;
import static Level_3.Exercise_1.util.ArticleManager.*;
import static Level_3.Exercise_1.util.EditorManager.*;

public class RunMain {

    static final Scanner scanner = new Scanner(System.in);

    public static void run() {

        System.out.println("--------------------------------------------");
        System.out.println("WELCOME TO THE MUNDO ANTIDEPORTIVO APP MENU.");
        System.out.println("--------------------------------------------");

        int option;

        do {
            Menu.showMenu();

            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1: addEditor(scanner); break;
                case 2: removeEditor(); break;
                case 3: addArticleToEditor(scanner); break;
                case 4: removeArticle(); break;
                case 5: showEditorArticles(); break;
                case 6: calculateArticlePrice(scanner); break;
                case 7: calculateArticleScore(scanner); break;
                case 0:
                    System.out.println("You have exited the program.");
                    break;
                default:
                    System.out.println("Invalid option. Please choose a menu item.");
            }
        } while (option != 0);
    }
}