package cli;

import java.util.ArrayList;
import java.util.Scanner;

import tickets.Ticket;

public class ReceiptPage extends PageView {

    // TODO ajouter une liste des Tickets et ajouter une initialisation appropriée dans le constructeur

    /** La valeur de {@code tickets} devrait venir du {@link ShoppingPage} */
    public ReceiptPage(Scanner input, ArrayList<Ticket> tickets) {
        super(input);
        // TODO écrire le reste du constructeur
    }

    @Override
    public boolean manageChoice(int choice) {
        // TODO écrire la méthode
        return true;
    }
    
}
