package com.wbb.dp.chapter02.mapinstance;

import java.util.HashMap;
import java.util.Map;

/**
 * 使用容器实现单例模式
 * Created by vico on 2018-05-29.
 */

public class SingletonManager {
    private static Map<String,Object> objMap=new HashMap<>();

    private SingletonManager() {}
    public static void registerService(String key,Object instance){
        if (!objMap.containsKey(key)){
            objMap.put(key,instance);
        }
    }

    public static Object getService(String key){
        return objMap.get(key);
    }
}
