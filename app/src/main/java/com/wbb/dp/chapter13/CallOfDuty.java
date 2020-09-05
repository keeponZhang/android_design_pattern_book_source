package com.wbb.dp.chapter13;

/**
 * 使命召唤游戏（数据模型可能不太合理，这里我们只是简单演示）
 *
 * @author vico
 * @date 2018-11-20
 */
public class CallOfDuty {
    private int mCheckpoint = 1;
    private int mLifeValue = 100;
    private String mWeapon = "沙漠之鹰";

    //玩游戏
    public void play() {
        System.out.println("玩游戏 ： " + String.format("第%d关", mCheckpoint) + "奋战杀敌中");
        mLifeValue = 10;
        System.out.println("进度升级啦");
        mCheckpoint++;
        System.out.println("到达" + String.format("第%d关", mCheckpoint));
    }

    //退出游戏
    public void quit() {
        System.out.println("--------------");
        System.out.println("退出前的游戏属性 ： " + this.toString());
        System.out.println("退出游戏");
        System.out.println("--------------");
    }

    /**
     * 创建备忘录
     */
    public Memoto createMemoto() {
        Memoto memoto = new Memoto();
        memoto.mCheckpoint = mCheckpoint;
        memoto.mLifeValue = mLifeValue;
        memoto.mWeapon = mWeapon;
        return memoto;
    }

    /**
     * 恢复游戏
     */
    public void restore(Memoto memoto) {
        this.mCheckpoint = memoto.mCheckpoint;
        this.mLifeValue = memoto.mLifeValue;
        this.mWeapon = memoto.mWeapon;
    }

    public int getCheckpoint() {
        return mCheckpoint;
    }

    public void setCheckpoint(int checkpoint) {
        mCheckpoint = checkpoint;
    }

    public int getLifeValue() {
        return mLifeValue;
    }

    public void setLifeValue(int lifeValue) {
        mLifeValue = lifeValue;
    }

    public String getWeapon() {
        return mWeapon;
    }

    public void setWeapon(String weapon) {
        mWeapon = weapon;
    }

    @Override
    public String toString() {
        return "CallOfDuty{" +
                "mCheckpoint=" + mCheckpoint +
                ", mLifeValue=" + mLifeValue +
                ", mWeapon='" + mWeapon + '\'' +
                '}';
    }
}
