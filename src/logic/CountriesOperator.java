package logic;

import data.Country;
import java.util.Map;
import java.util.Scanner;

public abstract class CountriesOperator {
    public static void runMenu(Map<String, Country> countriesData) {
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        do {
            System.out.println("-------------------------"); // screen separator
            System.out.println("Podaj dwuliterowy kod kraju (0. Wyjście):");
            String userInput = scanner.nextLine();
            userInput = userInput.toUpperCase();
            if (userInput.equals("0")) {
                loop = false;
                return;
            }
            if (countriesData.containsKey(userInput)) {
                //pobierz i wyswietl dane o kraju
                System.out.println(countriesData.get(userInput));
            } else {
                System.out.println("Kraj o podanym kluczu nie istnieje w bazie: " + userInput);
            }
        } while (loop);
    }
}
