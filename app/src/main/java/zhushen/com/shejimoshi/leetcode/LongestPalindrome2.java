package zhushen.com.shejimoshi.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Zhushen on 2018/7/20.
 */
public class LongestPalindrome2 {
    public static void main(String[] args){

    }


    public String longestPalindrome(String s) {
        //abcdefcda
        //adcfedcba
        int length = s.length();

        Map<String,Integer> map = new HashMap<>();

        for(int i = 0;i<length -2;i++){
            if(map.containsKey(2)&&map.containsKey(3)){
                break;
            }

            String str1 = s.substring(i,i+1);
            String str2 = s.substring(i+1,i+2);
            String str3 = s.substring(i+2,i+3);

            if(str1.equals(str2)){
                if(!map.containsValue(2)){
                    map.put(str1+str2,2);
                }
            }

            if(str1.equals(str3)){
                if(!map.containsValue(3)){
                    map.put(str1+str2+str3,3);
                }
            }

        }

        return null;
    }


    public String longestPalindrome2(String s) {
        //..bb..
        //..aba..
        List<Character> s_new = new ArrayList<>();
        for(int i = 0;i < s.length();i++){
            s_new.add('#');
            s_new.add(s.charAt(i));
        }
        s_new.add('#');
        List<Integer> Len = new ArrayList<>();
        String sub = "";//最长回文子串
        int sub_midd = 0;//表示在i之前所得到的Len数组中的最大值所在位置
        int sub_side = 0;//表示以sub_midd为中心的最长回文子串的最右端在S_new中的位置
        Len.add(1);
        for(int i = 1;i < s_new.size();i++){
            if(i < sub_side) {//i < sub_side时，在Len[j]和sub_side - i中取最小值，省去了j的判断
                int j = 2 * sub_midd - i;
                if(j >= 2 * sub_midd - sub_side &&Len.get(j) <= sub_side - i){
                    Len.add(Len.get(j));
                }else
                    Len.add(sub_side - i + 1);
            }
            else//i >= sub_side时，从头开始匹配
            Len.add(1);
            while( (i - Len.get(i) >= 0 && i + Len.get(i) < s_new.size()) && (s_new.get(i - Len.get(i)) == s_new.get(i + Len.get(i))))
                Len.set(i,Len.get(i) + 1);//s_new[i]两端开始扩展匹配，直到匹配失败时停止
            if(Len.get(i) >= Len.get(sub_midd)){//匹配的新回文子串长度大于原有的长度
                sub_side = Len.get(i) + i - 1;
                sub_midd = i;
            }
        }
        sub = s.substring((2*sub_midd - sub_side)/2,sub_side /2);//在s中找到最长回文子串的位置
        return sub;
    }
}
