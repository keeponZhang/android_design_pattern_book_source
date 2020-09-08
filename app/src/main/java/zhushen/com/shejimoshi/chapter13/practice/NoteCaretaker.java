package zhushen.com.shejimoshi.chapter13.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zhushen on 2018/5/15.
 */
public class NoteCaretaker {
    private static final int MAX = 30;
    List<Memoto> mMemotos = new ArrayList<>(MAX);
    int mIndex = 0;

    public void saveMemoto(Memoto memoto){
        if(mMemotos.size() >MAX){
            mMemotos.remove(0);
        }
        mMemotos.add(memoto);
        mIndex = mMemotos.size() - 1;
    }

    public Memoto getPrevMemoto(){
        mIndex = mIndex >0 ? --mIndex:mIndex;
        return mMemotos.get(mIndex);
    }

    public Memoto getNextMemoto(){
        mIndex = mIndex < mMemotos.size() -1 ? ++mIndex:mIndex;
        return mMemotos.get(mIndex);
    }

}
