package tickets;

public class Ticket {

    private Show show;
    private String owner;

    public Ticket(Show show, String owner) {
        this.show = show;
        this.owner = owner;
    }

    public Show getShow() {
        return show;
    }

    public String getOwner() {
        return owner;
    }

    public String toString() {
        String printableTicket = "";
        int width = 58;
        int remaining = width - show.getName().length();
        String fullLine = new String(new char[width+2]).replace("\0", "-");
        String halfLine = new String(new char[remaining/2]).replace("\0", "-");
        printableTicket += halfLine + " " + show.getName() + " " + halfLine + "\n\n";
        printableTicket += "  Ce billet appartient à :\n";
        printableTicket += "  " + owner + "\n\n";
        printableTicket += fullLine + "\n";

        return printableTicket;
    }
    
}
