package cli;
import java.util.Scanner;

public class ShoppingPage extends PageView {

    // TODO ajouter une liste des Tickets et ajouter une initialisation appropriée dans le constructeur

    
    public ShoppingPage(Scanner input) {
        super(input);
        
        String[] options = {
            "1. Acheter des billets",
            "2. Quitter"
        };
        this.options = options;
    }

    @Override
    public boolean manageChoice(int choice) {
        // TODO écrire la méthode
        return true;
    }

    // TODO écrire des méthodes utilitaires privées, au besoin
    
}
