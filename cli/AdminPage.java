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
        }
        return false;
    }

    private void deleteShow() {
        String name = getValue("Nom du spectacle > ", String.class);
        for (Show s : Show.getShows()) {
            if (s.getName().equals(name) || s.getName().contains(name)) {
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
        // TODO écrire la méthode
    }

    private void addShow() {
        // TODO écrire la méthode
    }

}
