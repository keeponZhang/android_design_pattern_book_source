package zhushen.com.shejimoshi.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Zhushen on 2018/9/30.
 */
public class advantageCount {
    public static void main(String[] args){
        int[] A = new int[]{5,4,3,2,1};
        int[] B = new int[]{16,8,4,2,1};

        advantageCount(A,B);
    }


    public static int[] advantageCount(int[] A, int[] B) {
        // 1 2 3 4 5
        // 1 2 4 8 16

        List<Integer> listA = new ArrayList<>();
        for(int i:A){
            listA.add(i);
        }
        Collections.sort(listA);
        Map<Integer,List<Integer>> mapB = new TreeMap<>();
        for(int j = 0; j< B.length; j++){
            List<Integer> childList = mapB.get(B[j]);
            if(childList == null){
                childList = new ArrayList<>();
            }
            childList.add(j);
            mapB.put(B[j],childList);
        }
        Iterator<Integer> iterator = mapB.keySet().iterator();
        int n=0;
        while (iterator.hasNext()){
            int data = iterator.next();
            for(n = n; n<listA.size(); n++){
                if(listA.get(n) > data){
                    break;
                }
            }
            List<Integer> indexList = mapB.get(data);
            for(int index: indexList){
                if(n<listA.size()){
                    A[index] = listA.get(n);
                    listA.remove(n);
                } else {
                    A[index] = listA.get(0);
                    listA.remove(0);
                }
            }
        }
        return A;

    }
}
