package com.wbb.dp.chapter21;

/**
 * @author vico
 * @date 2019-01-03
 */
public class Main {
    public static void main(String[] args) {
        //首先我们要有一个Person男孩
        Person person=new Boy();

        //然后为他穿上便宜的衣服，比如爱哥这样的Boy
        PersonCloth clothCheap=new CheapCloth(person);
        clothCheap.dressed();

        //或者给他穿上比较上档次的衣服，如SM
        PersonCloth clothExpensive=new ExpensiveCloth(person);
        clothExpensive.dressed();
    }
}
