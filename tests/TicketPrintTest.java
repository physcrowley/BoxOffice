package tests;

import tickets.Show;
import tickets.Ticket;

public class TicketPrintTest {

    void testTicketPrint() {
        Show.createShow("Show", 4);
        Show s = Show.getShows().get(0);
        s.buyTicket("Gary");
        s.buyTicket("Roger");
        s.buyTicket(null);
        s.buyTicket("Jenny");
        s.buyTicket("Rihanna"); // devrait afficher un message de complet

        for (Ticket t : s.getTickets()) {
            System.out.println(t);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        TicketPrintTest test = new TicketPrintTest();
        test.testTicketPrint();
    }
    
}
