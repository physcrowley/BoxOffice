package cli;
import java.util.Scanner;

public class UserPage extends PageView {

    
    protected UserPage(Scanner input) {
        super(input);
        
        String[] options = {
            "1. Acheter des billets",
            "2. Quitter"
        };
        this.options = options;
    }

    @Override
    public boolean manageChoice(int choice) {
        return false;
    }
    
}
