import java.util.Scanner;

public class TicketSalesCalc {
    int ticketCount;
    int PRICE_EACH = 2;
    int PRICE_BULK = 5;
    int BULK = 3;

    int singleTickets;
    int bulkTickets;
    int total;

    Scanner input = new Scanner(System.in);

    public TicketSalesCalc(){
        System.out.println("How many tickets sir?");
        ticketCount = Integer.parseInt(input.nextLine());
        setTicketCount(ticketCount);
    }

    public TicketSalesCalc(int directCount){
        setTicketCount(directCount);
    }

    public void Display(){
        System.out.println(this.toString());
    }

    public String toString() {
        String output = "You are buying " + ticketCount + " tickets for" +
                " $" + total;
        output += "";
        return output;
    }

    public void setTicketCount(int ticketCount) {
        singleTickets = (ticketCount % BULK)* PRICE_EACH;
        bulkTickets = (ticketCount / BULK)* PRICE_BULK;
        total = singleTickets + bulkTickets;
        this.ticketCount = ticketCount;
    }
}
