package cli;

import java.util.Scanner;

public abstract class PageView implements Menu, Controls {

    protected String[] options;
    protected Scanner inputSource;
    protected final String clear = "\033[H\033[2J";

    protected PageView(Scanner inputSource) {
        this.inputSource = inputSource;
    }

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
            return type.cast(inputSource.next());
        }
        if (type == Character.class) {
            return type.cast(inputSource.next().charAt(0));
        }
        if (type == Integer.class) {
            return type.cast(inputSource.nextInt());
        }
        if (type == Double.class) {
            return type.cast(inputSource.nextDouble());
        }
        if (type == Boolean.class) {
            return type.cast(inputSource.nextBoolean());
        }
        System.out.println("Type non supporté");
        return null;
    }

}
