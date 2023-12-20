package cli;

import java.util.Scanner;

public abstract class PageView implements Menu, Controls {

    protected String[] options;
    protected Scanner input;
    protected final String clear = "\033[H\033[2J";

    protected PageView(Scanner input) {
        this.input = input;
    }

    /**
     * Retourne {@code true} si l'utilisateur veut quitter le programme. Exécute des
     * actions appropriées en fonction du choix de
     * l'utilisateur et retourne {@code false} dans les autres cas.
     */
    public abstract boolean manageChoice(int choice);

    @Override
    public void show(String title) {
        System.out.println(clear + title);
        for (String option : options) {
            System.out.println(option);
        }
    }

    @Override
    public <T> T getValue(String prompt, Class<T> type) {
        System.out.print(prompt);
        if (type == String.class) {
            return type.cast(input.next());
        }
        if (type == Character.class) {
            return type.cast(input.next().charAt(0));
        }
        if (type == Integer.class) {
            return type.cast(input.nextInt());
        }
        if (type == Double.class) {
            return type.cast(input.nextDouble());
        }
        if (type == Boolean.class) {
            return type.cast(input.nextBoolean());
        }
        System.out.println("Type non supporté");
        return null;
    }

}
