import java.util.Scanner;

import cli.AdminPage;
import cli.FrontPage;

public class BoxOffice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        FrontPage front = new FrontPage(input);
        front.show("Bienvenue au Box Office!");
        int frontChoice = front.getValue("", Integer.class);
        if (frontChoice == 1) {
            AdminPage admin = new AdminPage(input);
            admin.show("Options administrateur");
        }
    }

}
