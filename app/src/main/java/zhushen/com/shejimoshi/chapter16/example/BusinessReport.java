package zhushen.com.shejimoshi.chapter16.example;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Zhushen on 2018/5/23.
 */
public class BusinessReport {
    List<Staff> mStaff = new LinkedList<>();

    public BusinessReport() {
        mStaff.add(new Manager("manager A"));
        mStaff.add(new Engineer("engineer a"));
        mStaff.add(new Engineer("engineer b"));
        mStaff.add(new Engineer("engineer c"));
        mStaff.add(new Engineer("engineer d"));
    }

    public void showReport(Visitor visitor){
        for(Staff staff:mStaff){
            staff.accept(visitor);
        }
    }
}
