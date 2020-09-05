package com.wbb.dp.chapter09;

/**
 * @author vico
 * @date 2018-11-14
 */
public class Manager extends Leader {

    @Override
    public int limit() {
        return 10000;
    }

    @Override
    public void handle(int money) {
        System.out.println("组长批复报销"+money+"元");
    }
}
