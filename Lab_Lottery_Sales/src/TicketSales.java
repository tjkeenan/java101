public class TicketSales {

    public static void main(String[] args) {

        TicketSalesCalc ticketSale1 = new TicketSalesCalc();

        ticketSale1.Display();

        TicketSalesCalc ticketSale2 = new TicketSalesCalc(22);

        ticketSale2.Display(); //should show $37 as the cost

        TicketSalesCalc ticketSale3 = new TicketSalesCalc(2);

        ticketSale3.setTicketCount(15);

        ticketSale3.Display();
    }
}
