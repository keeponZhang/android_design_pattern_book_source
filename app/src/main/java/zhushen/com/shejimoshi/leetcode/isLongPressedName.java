package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/10/24.
 */
public class isLongPressedName {
    public static void main(String[] args){
        boolean result = isLongPressedName("pyplrz","ppyypllr");
        int x = 0 ;
    }

    public static boolean isLongPressedName(String name, String typed) {
        int position = 1;
        if(name.charAt(0)!= typed.charAt(0)){
            return false;
        }
        for (int i = 1; i <typed.length() ; i++) {
            if(position<name.length()&&name.charAt(position)==typed.charAt(i)){
                position++;
            }else if(typed.charAt(i-1) == typed.charAt(i)){
            }else {
                return false;
            }
        }
        return position == name.length();
    }
}
