package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/12/1.
 */
public class isValidSerialization {
    public boolean isValidSerialization(String preorder) {
        int need = 1;
        for (String val:preorder.split(",")) {
            if(need == 0){
                return false;
            }
            need -= " #".indexOf(val);
        }
        return need == 0;
    }
}
