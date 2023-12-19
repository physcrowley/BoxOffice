package cli;

public interface Controls {
    /** Retourne une valeur de type {@code T} en se servant de l'invite
     * de commande {@code prompt}
     */
    <T> T getValue(String prompt, Class<T> type);
}
