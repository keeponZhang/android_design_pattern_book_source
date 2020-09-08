package zhushen.com.shejimoshi.chapter22.example1;

/**
 * Created by Zhushen on 2018/11/22.
 */
public class Test {
    public static void main(String[] args){
        Ticket ticket1 = TicketFactory.getTicket("A","B");
        ticket1.showTicketInfo("a");
        Ticket ticket2 = TicketFactory.getTicket("B","C");
        ticket2.showTicketInfo("bunk");
        Ticket ticket3 = TicketFactory.getTicket("C","D");
        ticket3.showTicketInfo("message");
        Ticket ticket4 = TicketFactory.getTicket("A","B");
        ticket4.showTicketInfo("message");
    }
}
