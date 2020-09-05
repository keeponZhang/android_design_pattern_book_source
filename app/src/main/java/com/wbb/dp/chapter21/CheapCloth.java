package com.wbb.dp.chapter21;

/**
 * @author vico
 * @date 2019-01-03
 */
public class CheapCloth extends PersonCloth {

    public CheapCloth(Person mPerson) {
        super(mPerson);
    }

    public void dressShorts() {
        System.out.println("穿条短裤");
    }

    @Override
    public void dressed() {
        super.dressed();
        dressShorts();
    }
}
