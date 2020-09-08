package zhushen.com.shejimoshi.Chapter2.exampleFive;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Zhenshen on 2017/3/1.
 */

public class SingletonManager {
    private static Map<String,Object> objectMap = new HashMap<>();

    private SingletonManager(){

    }

    public static void registerService(String key , Object instance){
        if(!objectMap.containsKey(key)){
            objectMap.put(key,instance);
        }
    }

    public static Object getService(String key){
        return objectMap.get(key);
    }
}
