package zhushen.com.shejimoshi.chapter22.example1;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Zhushen on 2018/11/22.
 */
public class TicketFactory {
//    public static Ticket getTicket(String from,String to){
//        return new TrainTicket(from,to);
//    }

    static Map<String,Ticket> sTicketMap = new ConcurrentHashMap<>();

    public static Ticket getTicket(String from,String to){
        String key = from + "-" + to;
        if(sTicketMap.containsKey(key)){
            System.out.println("use ==>" + key);
            return sTicketMap.get(key);
        }else {
            System.out.println("create object ==>" + key);
            Ticket ticket = new TrainTicket(from,to);
            sTicketMap.put(key,ticket);
            return ticket;
        }
    }
}
