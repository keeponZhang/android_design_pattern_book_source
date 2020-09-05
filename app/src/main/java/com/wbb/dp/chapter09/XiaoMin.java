package com.wbb.dp.chapter09;

/**
 * @author vico
 * @date 2018-11-14
 */
public class XiaoMin {
    public static void main(String[] args) {
        //构造各个领导对象
        GroupLeader groupLeader = new GroupLeader();
        Director director = new Director();
        Manager manager = new Manager();
        Boss boss = new Boss();

        //设置上一级领导处理者对象
        groupLeader.nextHandler = director;
        director.nextHandler = manager;
        manager.nextHandler = boss;

        //发起报账申请
        groupLeader.handleRequest(50000);
    }
}
