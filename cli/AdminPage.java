package cli;
import java.util.Scanner;

public class AdminPage extends PageView {

    public AdminPage(Scanner inputSource) {
        super(inputSource);
        String[] options = {
            "1. Ajouter un spectacle",
            "2. Modifier un spectacle",
            "3. Retirer un spectacle",
            "4. Quitter"
        };
        this.options = options;
    }
    
}
