package Level_3.Exercise_1.util;

public class Menu {

    public static void showMenu(){
        System.out.println("\nWhat would you like to do? Select an option:\n");
        System.out.print(
                "1. Add editor\n" +
                        "2. Remove editor\n" +
                        "3. Add article to an editor\n" +
                        "4. Remove article\n" +
                        "5. Show all articles by editor\n" +
                        "6. Calculate article price\n" +
                        "7. Calculate article score\n" +
                        "0. Exit program\n\n" +
                        "Selected option: ");

    }
}
