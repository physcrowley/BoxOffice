package cli;

import java.util.Scanner;

import tickets.Show;

public class AdminPage extends PageView {

    public AdminPage(Scanner input) {
        super(input);
        String[] options = {
                "1. Afficher la liste des spectacles",
                "2. Ajouter un spectacle",
                "3. Modifier un spectacle",
                "4. Supprimer un spectacle",
                "5. Quitter"
        };
        this.options = options;
    }

    @Override
    public boolean manageChoice(int choice) {
        if (choice == 5) { // Quitter
            return true;
        }

        switch (choice) {
            case 1:
                for (Show s : Show.getShows()) {
                    System.out.println(s);
                }
                pause();
                break;
            case 2:
                addShow();
                break;
            case 3:
                editShow();
                break;
            case 4:
                deleteShow();
                break;
            default:
                System.out.println("Choix invalide");
                pause();
        }
        return false;
    }

    private void pause() {
        input.nextLine(); // parce que `getValue` ne consomme pas les retours de ligne
        System.out.println("Tapez sur entrée pour continuer...");
        input.nextLine();
    }

    private void deleteShow() {
        String name = getValue("Nom du spectacle > ", String.class);
        Show s = Show.findShow(name);
        if (s == null) {
            System.out.println("Spectacle introuvable");
            return;
        }
        System.out.println(s);
        char confirm = getValue("Confirmer la suppression ? (o/n) > ", Character.class);
        if (confirm == 'o') {
            if (s.getTickets().size() > 0) {
                System.out.println("Impossible de supprimer un spectacle avec des billets vendus");
                return;
            }
            Show.getShows().remove(s);
            System.out.println("Spectacle supprimé");
        }
    }

    private void editShow() {
        // TODO écrire la méthode
    }

    private void addShow() {
        // TODO écrire la méthode
    }

}
