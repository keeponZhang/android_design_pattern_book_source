package zhushen.com.shejimoshi.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/**
 * Created by Zhushen on 2018/11/19.
 */
public class kSimilarity {
    //输入：A = "aabc", B = "abca"
    //输出：2


    //abcd
    //badc
    //1a -1a 1c -1c

    //abcd
    //bcda
    //1a 1a 1a -3a

    //abcdef
    //bfdcae    afdcbe  abdcfe abcdfe abcdef
    //1a 4b 1c -1c -4a -1e
    //-4a -1e -1c 1a 1c 4b
    public static int kSimilarity(String A, String B) {
        int length = A.length();
        int sum = 0;
        int pairSum = 0;
        int[] temp = new int[length];
        char a,b;
        for (int i = 0; i <length ; i++) {
            a = A.charAt(i);
            b = B.charAt(i);
            temp[i] = a-b;
            temp[i] *= a<b?a:b;
            if (temp[i]!=0){
                sum++;
            }
        }

        Arrays.sort(temp);
        int i = 0;
        int j = length-1;
        while (i<j){
            if(temp[i] == 0||temp[j] == 0){
                break;
            }
            int num = temp[i] + temp[j];
            if(num>0){
                j--;
            }else if(num<0){
                i++;
            }else {
                pairSum++;
                j--;
                i++;
            }
        }
        if(pairSum*2 == sum){
            return pairSum;
        }

        return sum-pairSum-1;

    }

    public static void main(String[] args){
        String A = "aabbccddee";
        String B = "dcacbedbae";
        int result = kSimilarity(A,B);
        int x = 0;

    }

    class Idx {
        int cnt;
        String str;

        public Idx(int cnt, String str) {
            this.cnt = cnt;
            this.str = str;
        }
    }

    private int kSimilarity2(String A, String B){
        Queue<Idx> queue=new LinkedList<Idx>();
        Set<String> vis=new HashSet<String>();
        queue.offer(new Idx(0,A));
        vis.add(A);
        while (!queue.isEmpty()){
            Idx cur=queue.poll();
            String curStr=cur.str;
            if(curStr.equals(B)){
                return cur.cnt;
            }
            int i;
            for(i=0;i<curStr.length();++i){
                if(curStr.charAt(i)!=B.charAt(i)){ //找到第一个不同的位置
                    break;
                }
            }
            for(int j=i+1;j<curStr.length();++j){
                if(curStr.charAt(j)==B.charAt(i)){
                    char[] swap=curStr.toCharArray(); //交换两个字符串
                    swap[i]^=swap[j];
                    swap[j]^=swap[i];
                    swap[i]^=swap[j];
                    String swapStr=String.valueOf(swap);
                    if(!vis.contains(swapStr)){ //未访问加入队列
                        queue.offer(new Idx(cur.cnt+1,swapStr));
                        vis.add(swapStr);
                    }
                }
            }
        }
        return -1;
    }
}
