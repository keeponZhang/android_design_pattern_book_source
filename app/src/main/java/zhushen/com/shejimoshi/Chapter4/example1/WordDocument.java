package zhushen.com.shejimoshi.Chapter4.example1;

import android.util.Log;

import java.util.ArrayList;

/**
 * Created by Zhenshen on 2017/3/13.
 */

public class WordDocument implements Cloneable {
    private String mText;
    private ArrayList<String> mImages = new ArrayList<String>();

    public WordDocument() {
    }

    @Override
    protected WordDocument clone(){
        try {
            WordDocument doc = (WordDocument) super.clone();
            doc.mText = this.mText;
            doc.mImages = this.mImages;
            return doc;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getmText() {
        return mText;
    }

    public void setmText(String mText) {
        this.mText = mText;
    }

    public ArrayList<String> getmImages() {
        return mImages;
    }

    public void addImages(String img) {
        this.mImages.add(img);
    }

    public void showDocument(){
        //打印文本内容
        Log.d("zhushen","text = " + mText);
        for (String img:mImages) {
            Log.d("zhushen","img = " + img);
        }
    }
}
