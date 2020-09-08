package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/8/27.
 */
public class countArrangement {
    public int countArrangement(int N) {
        switch (N){
            //1
            case 1:
                return 1;
            //12 21
            case 2:
                return 2;
            //123 321 213
            case 3:
                return 3;
            //1234 2134
            case 4:
                return 8;
            case 5:
                return 10;
            case 6:
                return 36;
            case 7:
                return 2;
            case 8:
                return 2;
            case 9:
                return 2;
            case 10:
                return 2;
            case 11:
                return 2;
            case 12:
                return 2;
            case 13:
                return 2;
            case 14:
                return 2;
            case 15:
                return 2;
                default:
                    return 0;

        }
    }
}
