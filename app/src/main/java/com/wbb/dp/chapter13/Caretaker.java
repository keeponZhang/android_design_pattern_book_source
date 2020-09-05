package com.wbb.dp.chapter13;

/**
 * Caretaker,负责管理Memoto
 *
 * @author vico
 * @date 2018-11-20
 */
public class Caretaker {
    Memoto mMemoto;//备忘录

    /**
     * 存档
     */
    public void archive(Memoto memoto) {
        this.mMemoto = memoto;
    }

    /**
     * 获取存档
     */
    public Memoto getMemoto() {
        return mMemoto;
    }
}
