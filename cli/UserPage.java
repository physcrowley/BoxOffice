package cli;
import java.util.Scanner;

public class UserPage extends PageView {

    
    protected UserPage(Scanner inputSource) {
        super(inputSource);
        
        String[] options = {
            "1. Acheter des billets",
            "2. Quitter"
        };
        this.options = options;
    }
    
}
