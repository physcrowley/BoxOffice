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
}