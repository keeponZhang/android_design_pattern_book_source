package com.wbb.dp.chapter22;

import java.util.Random;

/**
 * 火车票
 *
 * @author vico
 * @date 2019-01-07
 */
public class TrainTicket implements Ticket {

    public String from;//始发地
    public String to;//目的地
    public String bunk;//铺位
    public int price;

    TrainTicket(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void showTicketInfo(String bunk) {
        price = new Random().nextInt(300);
        System.out.println("购买 从" + from + "到" + to + "的 " + bunk + " 火车票" + ", 价格 ：" + price);
    }
}
