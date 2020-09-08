package zhushen.com.shejimoshi.Chapter4.example1;

/**
 * Created by Zhenshen on 2017/3/13.
 */

public class Client {

    public void run(){
        WordDocument originDoc = new WordDocument();

        originDoc.setmText("this is a word");
        originDoc.addImages("img1");
        originDoc.addImages("img2");
        originDoc.addImages("img3");
        originDoc.addImages("img4");

        originDoc.showDocument();

        WordDocument cloneDoc = originDoc.clone();
        cloneDoc.showDocument();

        cloneDoc.setmText("changed");

        originDoc.showDocument();
        cloneDoc.showDocument();
    }
}
