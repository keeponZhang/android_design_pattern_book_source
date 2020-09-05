package com.wbb.dp.chapter13;

import java.util.ArrayList;
import java.util.List;

/**
 * 负责管理Memoto对象
 *
 * @author vico
 * @date 2018-11-29
 */
public class NoteCaretaker {
    //最大存储数量
    private static final int MAX = 30;
    //存储30条记录
    List<Memotos> mMemotos = new ArrayList<Memotos>(MAX);

    int mIndex = 0;

    /**
     * 保存备忘录到记录列表中
     *
     * @param memotos memoto
     */
    public void saveMemoto(Memotos memotos) {
        if (mMemotos.size() > MAX) {
            mMemotos.remove(0);
        }
        mMemotos.add(memotos);
        mIndex = mMemotos.size() - 1;
    }

    /**
     * 获取上一个存档信息，相当于撤销功能
     *
     * @return
     */
    public Memotos getPrevMemoto() {
        mIndex = mIndex > 0 ? --mIndex : mIndex;
        return mMemotos.get(mIndex);
    }

    //获取下一个存档信息，相当于重做功能
    public Memotos getNextMemoto() {
        mIndex = mIndex < mMemotos.size() - 1 ? ++mIndex : mIndex;
        return mMemotos.get(mIndex);
    }
}
