import java.util.HashMap;
import java.util.Scanner;

import cli.FrontPage;
import tickets.Show;

public class BoxOffice {

    private HashMap<String, Show> events = new HashMap<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        

        FrontPage front = new FrontPage(input);
        while (true) {
            front.show("~~~ Box Office ~~~");
            int frontChoice = front.getValue("> ", Integer.class);
            if (front.manageChoice(frontChoice)) {
                break;
            }
        }
    }

    private void initialiseEvents() {
        events.put("1", new Show("Spectacle 1", 100));
        events.put("2", "Spectacle 2");
        events.put("3", "Spectacle 3");
    }
}
