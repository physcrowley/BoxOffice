import java.util.Scanner;

import cli.FrontPage;
import tickets.Show;

public class BoxOffice {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.console().reader());

        initialiseShows();

        FrontPage front = new FrontPage(input);
        while (true) {
            front.show("~~~ Box Office ~~~");
            int frontChoice = front.getValue("> ", Integer.class);
            if (front.manageChoice(frontChoice)) {
                break;
            }
        }
    }

    private static void initialiseShows() {
        Show.createShow("Les cuillères du ciel", 150);
        Show.createShow("Les fourchettes de l'enfer", 150);
        Show.createShow("Milles pattes mais aucun soulier", 30);
    }

    // TODO (optionnel) écrire des méthodes pour charger et sauvegarder les données (Show.getShows()), au début et la la fin d'une session, respectivement
}
