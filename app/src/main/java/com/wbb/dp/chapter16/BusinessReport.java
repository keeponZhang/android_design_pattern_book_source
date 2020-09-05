package com.wbb.dp.chapter16;

import java.util.LinkedList;
import java.util.List;

/**
 * 员工业务报表1类
 * @author vico
 * @date 2018-12-01
 */
public class BusinessReport {
    List<Staff> mStaffs=new LinkedList<>();

    public BusinessReport(){
        mStaffs.add(new Manager("王经理"));
        mStaffs.add(new Engineer("工程师-Shawn.Xiong"));
        mStaffs.add(new Engineer("工程师-Kael"));
        mStaffs.add(new Engineer("工程师-Chaossss"));
        mStaffs.add(new Engineer("工程师-Tiiime"));
    }

    /**
     * 为访问者展示报表
     * @param visitor 公司高层，如CEO、CTO
     */
    public void showReport(Visitor visitor){
        for (Staff staff : mStaffs) {
            staff.accept(visitor);
        }
    }
}
