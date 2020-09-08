package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/7/19.
 */
public class checkRecord {
    public static void main(String[] args){

    }

    public boolean checkRecord(String s) {
        int countA = 0;
        int countL = 0;
        for(int i = 0;i<s.length();i++){
            if(s.substring(i,i+1).equals("A")){
                countA++;
            }
            if(s.substring(i,i+1).equals("L")){
                countL++;
                if(countL>2){
                    return false;
                }
            }else {
                countL = 0;
            }
        }
        if(countA >1){
            return false;
        }
        return true;
    }
}
