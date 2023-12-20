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
        StringBuilder printableTicket = new StringBuilder();
        int width = 58;

        printableTicket.append(fullLine(width) + "\n");
        printableTicket.append(textCenteredLine(show.getName(), width) + "\n\n");
        printableTicket.append("  Ce billet appartient à :\n");
        printableTicket.append("  " + owner + "\n\n");
        String num = "Billet n° " + show.getTickets().indexOf(this);
        printableTicket.append(textCenteredLine(num, width));
        printableTicket.append(fullLine(width) + "\n");

        return printableTicket.toString();
    }

    private String textCenteredLine(String text, int width) {
        int remaining = width - text.length();
        String halfLine = new String(new char[remaining/2]).replace("\0", "-");
        return halfLine + " " + text + " " + halfLine;
    }

    private String fullLine(int width) {
        return new String(new char[width]).replace("\0", "-");
    }
    
}
