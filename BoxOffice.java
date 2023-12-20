import java.util.Scanner;

import cli.FrontPage;
import tickets.Show;

public class BoxOffice {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.console().reader());

        initialiseEvents();

        FrontPage front = new FrontPage(input);
        while (true) {
            front.show("~~~ Box Office ~~~");
            int frontChoice = front.getValue("> ", Integer.class);
            if (front.manageChoice(frontChoice)) {
                break;
            }
        }
    }

    private static void initialiseEvents() {
        Show.createShow("Les cuillères du ciel", 150);
        Show.createShow("Les fourchettes de l'enfer", 150);
        Show.createShow("Milles pattes mais aucun soulier", 30);
    }
}
