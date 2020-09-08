package zhushen.com.shejimoshi.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Zhushen on 2018/7/27.
 */
public class frequencySort {
    public static void main(String[] args){

    }

    public String frequencySort(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] temp = new int[52];

        for (int i = 0; i < s.length() ; i++) {
            char c = s.charAt(i);
            if(c<='z'&&c>='a'){
                temp[c-'a']++;
            }else {
                temp[c-'A'+ 26]++;
            }
        }

        int size = 1;
        while (stringBuilder.length()<s.length()){
            for (int i = 0; i < 52; i++) {
                if(temp[i] == size){
                    char c;
                    if(i<26){
                         c = (char) (i+ 'a');
                    }else {
                        c = (char) (i+'A'-26);
                    }
                    for (int j = 0; j < size; j++) {
                        stringBuilder.append(c);
                    }
                }
            }
            size++;
        }

        return stringBuilder.reverse().toString();
    }
}
