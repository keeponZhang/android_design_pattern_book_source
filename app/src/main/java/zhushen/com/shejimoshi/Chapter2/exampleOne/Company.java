package zhushen.com.shejimoshi.Chapter2.exampleOne;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import zhushen.com.shejimoshi.Chapter2.exampleOne.People.Staff;

/**
 * Created by Zhenshen on 2017/3/1.
 */

public class Company {
    private String TAG = "Company";

    private List<Staff> allStaffs = new ArrayList<>();

    public void addStaff(Staff per){
        allStaffs.add(per);
    }

    public void showAllStaffs(){
        for (Staff per: allStaffs ) {
            Log.d(TAG , "Obj = " + per.toString());
        }
    }
}
