package zhushen.com.shejimoshi.leetcode;

import java.util.HashMap;
import java.util.Stack;

/**
 * Created by Zhushen on 2018/7/12.
 */
public class StackTest {
    public static void main(String[] args){
        Stack stack = new Stack();

        stack.push("1");
        stack.push("2");
        stack.pop();


        StringBuilder sb = new StringBuilder();
        sb.append("123456");
        sb.reverse();

        sb.equals("654321");
        sb.length();


        int i = sb.length();

        String str = "()[]{}()()()";

//        boolean result = isValid(str);

        boolean test = isValid("(([]){})");
        str.replace("(","1");

        String str1 = str.substring(0,3);
        String str2 = str.substring(3);

        String string = "aaa";
        boolean startsWith = string.endsWith("aa");

        String[] strings = string.split("a");
        int length = strings[0].length();

        HashMap<String, Integer> map = new HashMap<>();
        map.put("(",1);
        map.put("[",2);
        map.put("{",3);

        if(map.containsKey("(")){
            int x = map.get("(");
        }
    }


    public static boolean isValid(String s) {
        HashMap<String, String> map = new HashMap<>();
        map.put("(",")");
        map.put("[","]");
        map.put("{","}");

//        return judge(s,map);
        return StackJudge(s,map);
    }

    private static boolean judge(String s, HashMap<String, String> map){
        if(s.equals("")){
            return true;
        }
        StringBuilder sb = new StringBuilder();
        String temp = "";
        for(int i=0;i<s.length();i++){
            temp = s.substring(i,i+1);
            if(map.containsKey(temp)){
                sb.append(map.get(temp));
            }
            if(map.containsValue(temp)){
                sb.toString();
                sb.reverse();
                int length = sb.length();
                if(sb.toString().equals(s.substring(length,length*2))){
                    return judge(s.substring(length*2),map);
                }else{
                    return false;
                }
            }
        }
        return false;
    }


    private static boolean StackJudge(String str, HashMap<String, String> map){
        if(str.equals("")){
            return true;
        }
        Stack<String> stack = new Stack<>();

        String temp = "";
        for(int i = 0;i<str.length();i++){
            temp = str.substring(i,i+1);
            if(map.containsKey(temp)){
                stack.push(map.get(temp));
            }else if(map.containsValue(temp)){
                if(stack.empty()){
                    return false;
                }
                if(stack.peek().equals(temp)){
                    stack.pop();
                }else {
                    return false;
                }
            }
        }

        return  stack.empty();
    }


    public int searchInsert(int[] nums, int target) {
        int i =0;
        for(;i<nums.length;i++){
            if(target<=nums[i]){
                return i;
            }
        }

        return i;
    }

}
