package com.wbb.dp.chapter21;

/**
 * @author vico
 * @date 2019-01-03
 */
public abstract class PersonCloth extends Person {

    protected Person mPerson;//保持一个Person类的引用

    public PersonCloth(Person mPerson) {
        this.mPerson = mPerson;
    }

    @Override
    public void dressed() {
        //调用Person类中的dressed方法
        mPerson.dressed();
    }
}
