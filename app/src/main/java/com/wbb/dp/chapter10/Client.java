package com.wbb.dp.chapter10;

/**
 * @author vico
 * @date 2018-11-15
 */
public class Client {
    public static void main(String[] args) {
        Calculator c=new Calculator("153 + 3589 - 555 - 597 - 66");
        System.out.println(c.calculate());
    }
}
