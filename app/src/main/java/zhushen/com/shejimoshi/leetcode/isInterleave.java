package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/10/25.
 */
public class isInterleave {
    //s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac"
    //aa d b bc b c a c

    //s1 = "aabcc", s2 = "dbbca", s3 = "aadbbbaccc"
    //aa dbb b

    public static void main(String[] args){
        boolean result = isInterleave("aabcc",  "dbbca","aadbbcbcac");
        int x = 0;
    }

    public static boolean isInterleave(String s1, String s2, String s3) {
        int len1 = s1.length();
        int len2 = s2.length();
        int len3 = s3.length();

        if(len1 + len2 != len3){
            return false;
        }

        boolean[][] f = new boolean[len1+1][len2+1];
        f[0][0] = true;//第一个设置为true
        for(int i = 0; i < len1+1;i++){
            for(int j = 0; j < len2+1; j++){
                //i>0,j>0的条件是摒除i=0j=0的值
                if(j > 0){
                    f[i][j] = f[i][j-1]&&(s3.charAt(i+j-1) == s2.charAt(j-1));
                }
                if(i > 0){
                    f[i][j] = f[i][j] || ( f[i-1][j]&&(s3.charAt(i+j-1) == s1.charAt(i-1)));
                }
            }
        }
        return f[len1][len2];

    }
}
