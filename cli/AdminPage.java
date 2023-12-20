package cli;
import java.util.Scanner;

public class AdminPage extends PageView {

    public AdminPage(Scanner input) {
        super(input);
        String[] options = {
            "1. Ajouter un spectacle",
            "2. Modifier un spectacle",
            "3. Retirer un spectacle",
            "4. Quitter"
        };
        this.options = options;
    }

     /** 
     * Retourne {@code true} si l'utilisateur veut quitter le programme. Exécute des 
     * actions appropriées sur la listes des évenements en fonction du choix de 
     * l'utilisateur et retourne {@code false} dans les autres cas.
     */
    @Override
    public boolean manageChoice(int choice) {
        if (choice == 4) { // Quitter
            return true;
        }

        switch (choice) {
            case 1:
                addShow();
                break;
            case 2:
                editShow();
                break;
            case 3:
                deleteShow();
                break;
            default:
                System.out.println("Choix invalide");
        }
        return false;
    }

    private void deleteShow() {
    }

    private void editShow() {
    }

    private void addShow() {
    }
    
}
