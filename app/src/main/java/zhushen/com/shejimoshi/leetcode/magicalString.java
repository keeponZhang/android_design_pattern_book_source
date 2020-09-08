package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/8/17.
 */
public class magicalString {

    public int magicalString(int n) {
        //1 22 11 2 1 22 1 22 11 2 11 22 ......
        //1 2 2 1 1 2 1 2 2 1 2 2

        //1 2   2     1 1     2 1     2 2 1       2 2 1 1 2       1 1 2 2 1 2 1 1
        //1 22  11   2 1     22 1    22 11 2     11 22 1 2 11    2 1 22 11 2 11 2 1
        //12211212212211211221211
        if(n <= 0)
            return 0;
        if(n <= 3)
            return 1;
        StringBuilder base = new StringBuilder();
        StringBuilder sub = new StringBuilder();
        base.append("122");
        sub.append("12");
        int index = 0;
        int temp = 0;
        int counts = 1;
        while (base.length() < n){
            index = sub.length();
            temp =  base.charAt(index)-'0';
            sub.append(temp);
            if(temp==2){
                temp = base.charAt(base.length()-1)-'0';
                if(temp == 2){
                    base.append("11");
                    if(base.length() <= n)
                        counts += 2;
                    else
                        counts += 1;
                }else {
                    base.append("22");
                }
            }else {//temp == 1
                temp = base.charAt(base.length()-1)-'0';
                if(temp == 2){
                    base.append("1");
                    counts += 1;
                }else {
                    base.append("2");
                }
            }
        }
        return counts;

    }
}
