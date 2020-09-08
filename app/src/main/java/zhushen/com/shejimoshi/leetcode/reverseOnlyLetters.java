package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/10/29.
 */
public class reverseOnlyLetters {
    public String reverseOnlyLetters(String S) {
        if(S.length()<2){
            return S;
        }
        int l = 0;
        char[] s = S.toCharArray();
        char temp;
        int r = s.length-1;
        while(l<r){
            if(((s[l]>='A'&&s[l]<='Z')||(s[l]>='a'&&s[l]<='z'))&&((s[r]>='A'&&s[r]<='Z')||(s[r]>='a'&&s[r]<='z'))){
//                swap(s[l++],s[r--]);    //如果左右都是字母，则交换。
                temp = s[l];
                s[l] = s[r];
                s[r] = temp;
                l++;
                r--;
            } else if(!((s[l]>='A'&&s[l]<='Z')||(s[l]>='a'&&s[l]<='z'))&&((s[r]>='A'&&s[r]<='Z')||(s[r]>='a'&&s[r]<='z')))
                l++;                    //左边不是字母，左边做加一操作。
            else if(((s[l]>='A'&&s[l]<='Z')||(s[l]>='a'&&s[l]<='z'))&&!((s[r]>='A'&&s[r]<='Z')||(s[r]>='a'&&s[r]<='z')))
                r--;                   //右边不是字母，右边做减一操作。
            else                       //都不是字母，则左加一右减一。
            {
                l++;
                r--;
            }
        }
        return String.valueOf(s);
    }
}
