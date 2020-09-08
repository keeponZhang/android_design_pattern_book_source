package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/10/10.
 */
public class getMaxRepetitions {

    //s1 ="acb",n1 = 4
    //s2 ="ab",n2 = 2

    //acbacbacbacb
    //abab

    public int getMaxRepetitions(String s1, int n1, String s2, int n2) {
        int count1 = 0, count2 = 0, i = 0, j = 0;
        char[] cArr1 = s1.toCharArray(), cArr2 = s2.toCharArray();

        while(count1 < n1){
            if(cArr1[i] == cArr2[j]){
                j++;
                if(j == cArr2.length){
                    j = 0;
                    count2++;
                }
            }
            i++;
            if(i == cArr1.length){
                i = 0;
                count1++;
            }
        }

        return count2 / n2;

    }
}
