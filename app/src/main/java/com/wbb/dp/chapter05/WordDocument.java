package com.wbb.dp.chapter05;

import java.util.ArrayList;
import java.util.List;

/**
 * 文档类型，扮演的是ConcretePrototype角色，而cloneable是代表prototype角色
 * Created by vico on 2018-06-18.
 */

public class WordDocument implements Cloneable {
    //文本
    private String mText;
    //图片名列表
    private ArrayList<String> mImages = new ArrayList<>();

    public WordDocument() {
        System.out.println("-----------WordDocument构造函数--------------");
    }

    @Override
    protected WordDocument clone() {
        try {
            WordDocument doc = (WordDocument) super.clone();
            doc.mText = this.mText;
            doc.mImages = this.mImages;
            //对 mImages对象也调用clone()函数，进行深拷贝
//            doc.mImages= (ArrayList<String>) this.mImages.clone();
            return doc;
        } catch (Exception e) {

        }
        return null;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        this.mText = text;
    }

    public List<String> getImages() {
        return mImages;
    }

    public void addImage(String img) {
        this.mImages.add(img);
    }

    /**
     * 打印文档内容
     */
    public void showDocument() {
        System.out.println("--------Word Content Start");
        System.out.println("Text : " + mText);
        System.out.println("Images List: ");
        for (String imgName : mImages) {
            System.out.println("image name : " + imgName);
        }
        System.out.println("--------Word Content End-------------");
    }
}
