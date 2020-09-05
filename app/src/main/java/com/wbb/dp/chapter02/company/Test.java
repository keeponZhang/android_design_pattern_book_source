package com.wbb.dp.chapter02.company;

/**
 * Created by vico on 2018-05-29.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 普通员工
 */
class Staff {
    public void work() {
        //干活
    }
}

//副总裁
class VP extends Staff {
    @Override
    public void work() {
        //管理下面的经理
    }
}

//CEO, 饿汉单例模式
class CEO extends Staff {
    private static final CEO mCeo = new CEO();

    //构造函数私有
    private CEO() {

    }

    //公有的静态函数，对外暴露获取单例对象的接口
    public static CEO getCeo() {
        return mCeo;
    }

    @Override
    public void work() {
        //管理VP
    }
}

//公司类
class Company {
    private List<Staff> allPersons = new ArrayList<>();

    public void addStaff(Staff per) {
        allPersons.add(per);
    }

    public void showAllStaffs() {
        for (Staff person : allPersons) {
            System.out.println("obj:" + person.toString());
        }
    }
}

public class Test {

    public static void main(String[] args) {
        Company cp = new Company();
        //CEO对象只能通过getCeo函数获取
        Staff ceo1 = CEO.getCeo();
        Staff ceo2 = CEO.getCeo();
        cp.addStaff(ceo1);
        cp.addStaff(ceo2);
        //通过new创建VP对象
        Staff vp1 = new VP();
        Staff vp2 = new VP();
        //通过new创建Staff对象
        Staff staff1 = new Staff();
        Staff staff2 = new Staff();
        Staff staff3 = new Staff();

        cp.addStaff(vp1);
        cp.addStaff(vp2);
        cp.addStaff(staff1);
        cp.addStaff(staff2);
        cp.addStaff(staff3);

        cp.showAllStaffs();
    }
}
