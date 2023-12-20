package cli;

import java.util.Scanner;

import tickets.Show;

public class AdminPage extends PageView {

    public AdminPage(Scanner input) {
        super(input);
        String[] options = {
                "1. Ajouter un spectacle",
                "2. Modifier un spectacle",
                "3. Supprimer un spectacle",
                "4. Quitter"
        };
        this.options = options;
    }

    
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
        String name = getValue("Nom du spectacle > ", String.class);
        for (Show s : Show.getShows()) {
            if (s.getName().equals(name)) {
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
                return;
            }
        }
        System.out.println("Spectacle introuvable");
    }

    private void editShow() {
    }

    private void addShow() {
    }

}
