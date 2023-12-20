package cli;

import java.util.Scanner;

public class FrontPage extends PageView {

    public FrontPage(Scanner input) {
        super(input);

        String[] options = {
                "1. Mode administrateur",
                "2. Acheter des billets",
                "3. Quitter"
        };
        this.options = options;
    }

    @Override
    public boolean manageChoice(int choice) {
        if (choice == 3) { // Quitter
            return true;
        }

        switch (choice) {
            case 1:
                AdminPage admin = new AdminPage(input);
                while (true) {
                    admin.show("Mode administrateur");
                    int adminChoice = admin.getValue("[admin] > ", Integer.class);
                    if (admin.manageChoice(adminChoice)) {
                        break;
                    }
                }
                break;
            case 2:
                ShoppingPage shop = new ShoppingPage(input);
                while (true) {
                    shop.show("Voici les spectacles disponibles. Faites votre choix :");
                    int userChoice = shop.getValue("> ", Integer.class);
                    if (shop.manageChoice(userChoice)) {
                        break;
                    }
                }
                // TODO afficher le reçu avec la ReceiptPage
                break;
            default:
                System.out.println("Choix invalide");
        }
        return false;
    }
}