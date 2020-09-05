package com.wbb.dp.chapter02.enuminstance;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * Created by vico on 2018-05-29.
 */

public class Singleton implements Serializable{
    private static final long serialVersionUID=0L;
    private static final Singleton INSTANCE=new Singleton();

    private Singleton(){

    }

    public static Singleton getInstance(){
        return INSTANCE;
    }

    private Object readResolve() throws ObjectStreamException{
        return INSTANCE;
    }
}
