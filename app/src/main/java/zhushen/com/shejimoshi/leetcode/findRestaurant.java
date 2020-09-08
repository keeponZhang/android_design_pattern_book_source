package zhushen.com.shejimoshi.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Zhushen on 2018/10/31.
 */
public class findRestaurant {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer> map=new HashMap<String,Integer>();
        List<String> list=new ArrayList<String>();
        int index=0;
        //将list1元素存入哈希表
        for(int i=0;i<list1.length;i++) {
            map.put(list1[i], i+1);
        }
        //查看list2中的元素在哈希表是否存在
        for(int i=0;i<list2.length;i++) {
            if(map.containsKey(list2[i])) {
                if(index==0) {   //第一次找到相同的
                    list.add(list2[i]);
                    index=i+map.get(list2[i]);
                }else if(index==i+map.get(list2[i])) {  //找到相同的，且索引和相同
                    list.add(list2[i]);
                }else if(index>i+map.get(list2[i])) {    //找到相同的，索引和小于原来的索引和
                    list.clear();
                    list.add(list2[i]);
                    index=i+map.get(list2[i]);
                }
            }
        }
        int len=list.size();
        String s[]=new String[len];
        int i=0;
        for(String str:list) {
            s[i]=str;
            i++;
        }
        return s;
    }
}
