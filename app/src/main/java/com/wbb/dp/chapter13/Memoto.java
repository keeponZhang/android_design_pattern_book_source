package com.wbb.dp.chapter13;

/**
 * 备忘录类
 *
 * @author vico
 * @date 2018-11-20
 */
public class Memoto {
    public int mCheckpoint;
    public int mLifeValue;
    public String mWeapon;

    @Override
    public String toString() {
        return "Memoto [" +
                "mCheckpoint=" + mCheckpoint +
                ", mLifeValue=" + mLifeValue +
                ", mWeapon=" + mWeapon + "]";
    }
}
