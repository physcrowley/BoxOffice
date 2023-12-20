package tickets;

import java.util.ArrayList;

public class Show {

    private static ArrayList<Show> list = new ArrayList<Show>();
    private String name;
    private int capacity;

    private ArrayList<Ticket> tickets;
    private boolean isSoldOut;

    /** Le constructeur par défaut n'est pas accessible */
    private Show(){}

    public static Show createShow(String name, int capacity) {
        for (Show s : Show.list) {
            if (s.name.equals(name)) {
                System.out.println("Un événement de ce nom existe déja : " + name);
                // retourner l'événement existant
                return s;
            }
        }
        // sinon, créé l'événement et lui assigner les valeurs
        Show s = new Show();
        s.name = name;
        s.capacity = capacity;
        s.tickets = new ArrayList<>();
        s.isSoldOut = false;
        // ajouter l'événement à la liste
        Show.list.add(s);
        // retourner le nouvel événement
        return s;
    }

    public Show findShow(String name) {
        for (Show s : Show.list) {
            // nom complet ou partiel
            if (name.equals(s.name) || s.name.contains(name))
                return s;
        }
        // échec
        return null;
    }

    public boolean isSoldOut() {
        return this.isSoldOut;
    }

    public Ticket buyTicket(String buyer) {
        if (this.isSoldOut) {
            System.out.println(buyer + ", l'événement " + this.name + " est complet.");
            return null;
        }
        Ticket t = new Ticket(this, buyer);
        this.tickets.add(t);
        if (this.tickets.size() == this.capacity) {
            this.isSoldOut = true;
        }
        return t;
    }

    public ArrayList<Ticket> getTickets() {
        return this.tickets;
    }

    public static ArrayList<Show> getShows() {
        return list;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public String toString() {
        return this.name + " (" + this.tickets.size() + "/" + this.capacity + ")";
    }


}
