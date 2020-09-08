package zhushen.com.shejimoshi.chapter22.example1;

import java.util.Random;

/**
 * Created by Zhushen on 2018/11/22.
 */
public class TrainTicket implements Ticket {
    public String from;
    public String to;
    public String bunk;
    public int price;

    public TrainTicket(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void showTicketInfo(String bunk) {
        price = new Random().nextInt(300);
        System.out.println("buy ticket from: " + from + "to: " + to + "bunk:" + bunk + "price:" + price);
    }
}
