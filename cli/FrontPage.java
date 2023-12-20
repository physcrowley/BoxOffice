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

    /** 
     * Retourne {@code true} si l'utilisateur veut quitter le programme. Exécute des 
     * actions appropriées en fonction du choix de l'utilisateur et retourne {@code false}
     * sinon.
     */
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
                    if (admin.manageChoice(adminChoice)){
                        break;
                    }
                }
                break;
            case 2:
                UserPage user = new UserPage(input);
                while (true) {
                    user.show("Voici les spectacles disponibles. Faites votre choix :");
                    int userChoice = user.getValue("> ", Integer.class);
                    if (user.manageChoice(userChoice)) {
                        break;
                    }
                }
                break;
            default:
                System.out.println("Choix invalide");
        }
        return false;
    }
}