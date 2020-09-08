package zhushen.com.shejimoshi.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zhushen on 2018/8/29.
 */
public class getRow {
    public static void main(String[] args){
        getRow(30);
    }

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> list=new ArrayList<Integer>();

        for(int i=0;i<=rowIndex;i++){
            list.add(1);
            for(int j=i-1;j>=1;j--){
                list.set(j, list.get(j)+list.get(j-1) );
            }
        }
        return list;
    }
}
