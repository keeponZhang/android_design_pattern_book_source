package zhushen.com.shejimoshi.Chapter2.exampleOne.People;

/**
 * Created by Zhenshen on 2017/3/1.
 */

public class CEO extends Staff {
    private static final CEO mCEO = new CEO();

    public CEO() {
    }

    public static CEO getmCEO() {
        return mCEO;
    }

    @Override
    public void work() {
        //管理VP
    }
}
