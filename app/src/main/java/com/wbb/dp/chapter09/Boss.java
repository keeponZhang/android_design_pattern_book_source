package com.wbb.dp.chapter09;

/**
 * @author vico
 * @date 2018-11-14
 */
public class Boss extends Leader {

    @Override
    public int limit() {
        return Integer.MAX_VALUE;
    }

    @Override
    public void handle(int money) {
        System.out.println("组长批复报销" + money + "元");
    }
}
