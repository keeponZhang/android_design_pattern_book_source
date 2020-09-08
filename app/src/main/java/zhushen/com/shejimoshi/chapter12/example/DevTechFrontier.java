package zhushen.com.shejimoshi.chapter12.example;

import java.util.Observable;

/**
 * Created by Zhushen on 2018/5/12.
 */
public class DevTechFrontier extends Observable {

    public void postNewPublication(String content){
        setChanged();
        notifyObservers(content);
    }
}
