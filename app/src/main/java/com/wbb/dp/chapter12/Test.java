package com.wbb.dp.chapter12;

/**
 * 测试代码
 *
 * @author weibb
 * @date 2018-11-19
 * email: weibb@chingo.cn
 */
public class Test {
    public static void main(String[] args) {
        //被观察者的角色
        DevTechFrontier DevTechFrontier = new DevTechFrontier();
        //观察者
        Coder mrsimple = new Coder("mr.simple");
        Coder coder1 = new Coder("coder-1");
        Coder coder2 = new Coder("coder-2");
        Coder coder3 = new Coder("coder-3");

        //将观察者注册到可观察对象的观察者列表中
        DevTechFrontier.addObserver(mrsimple);
        DevTechFrontier.addObserver(coder1);
        DevTechFrontier.addObserver(coder2);
        DevTechFrontier.addObserver(coder3);

        //发布消息
        DevTechFrontier.postNewPublication("新的一期开发技术前线周报发布啦！");
    }
}
