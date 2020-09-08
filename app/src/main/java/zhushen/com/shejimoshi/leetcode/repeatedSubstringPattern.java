package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/7/23.
 */
public class repeatedSubstringPattern {


    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        for(int i=1;i<=len/2;i++) {//最大长度
            if(len%i == 0) {
                String tem = s.substring(0, i);//子串
                StringBuffer sb = new StringBuffer();
                for(int j=0;j<len/i;j++) {
                    sb = sb.append(tem);//生成相同长度
                }
                if(sb.toString().equals(s))//验证
                    return true;
            }
        }
        return false;
    }
}
